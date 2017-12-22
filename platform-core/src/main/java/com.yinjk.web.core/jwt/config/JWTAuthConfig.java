package com.yinjk.web.core.jwt.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

@Configuration
@ConfigurationProperties("jwt")
public class JWTAuthConfig {

    private String signingKey = "zA/*xp?$[/5*z";

    private int expiredSeconds = 86400;

    public JWTAuthConfig() {
    }

    public int getExpiredSeconds() {
        return this.expiredSeconds;
    }

    public void setExpiredSeconds(int expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
    }

    public String getSigningKey() {
        Assert.notNull(this.signingKey, "jwt.signing-key 不能为空");
        return this.signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }
}