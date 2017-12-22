package com.yinjk.web.core.jwt.util;

import com.yinjk.web.core.enums.EApiStatus;
import com.yinjk.web.core.exception.BizException;
import com.yinjk.web.core.jwt.config.JWTAuthConfig;
import com.yinjk.web.core.util.SpringContextHolder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtil {

    private static JWTAuthConfig jwtAuthConfig = SpringContextHolder.getBean(JWTAuthConfig.class);

    public static String generateToken(String signingKey, Map data, int expiredSeconds) {
        return Jwts.builder().setClaims(data).setExpiration(new Date(System.currentTimeMillis() + (long)(expiredSeconds * 1000))).signWith(SignatureAlgorithm.HS256, signingKey).compact();
    }

    public static String generateToken(Map data) {
        return Jwts.builder().setClaims(data).setExpiration(new Date(System.currentTimeMillis() + (long)(jwtAuthConfig.getExpiredSeconds() * 1000))).signWith(SignatureAlgorithm.HS256, jwtAuthConfig.getSigningKey()).compact();
    }

    public static Map getJwtBody(String signingKey, String token) {
        if (token == null) {
            return null;
        } else {
            JwtParser jwtParser = Jwts.parser().setSigningKey(signingKey);
            if (jwtParser.isSigned(token)) {
                Object obj = jwtParser.parse(token).getBody();
                return obj != null ? (Map)obj : null;
            } else {
                return null;
            }
        }
    }

    public static Map getJwtBody(String token) {
        if (token == null) {
            return null;
        } else {
            JwtParser jwtParser = Jwts.parser().setSigningKey(jwtAuthConfig.getSigningKey());
            if (jwtParser.isSigned(token)) {
                Object obj = jwtParser.parse(token).getBody();
                return obj != null ? (Map)obj : null;
            } else {
                return null;
            }
        }
    }

    public static String refreshToken(String signingKey, String token, int expiredSeconds) throws BizException {
        Map jwtBody = getJwtBody(signingKey, token);
        if (jwtBody != null) {
            return generateToken(signingKey, jwtBody, expiredSeconds);
        } else {
            throw new BizException(EApiStatus.ERR_SYS.getStatus(), "刷新token失败", new Object[0]);
        }
    }

    public static String refreshToken(String token) throws BizException {
        Map jwtBody = getJwtBody(jwtAuthConfig.getSigningKey(), token);
        if (jwtBody != null) {
            return generateToken(jwtAuthConfig.getSigningKey(), jwtBody, jwtAuthConfig.getExpiredSeconds());
        } else {
            throw new BizException(EApiStatus.ERR_SYS.getStatus(), "刷新token失败", new Object[0]);
        }
    }
}
