package com.yinjk.web.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "md5")
public class Md5InfoConfig {

    private String slat1 = "^*/-@![%^(yj=+}";

    private String slat2 = "?>)*ui^/#$%@L";

    public String getSlat1() {
        return slat1;
    }

    public void setSlat1(String slat1) {
        this.slat1 = slat1;
    }

    public String getSlat2() {
        return slat2;
    }

    public void setSlat2(String slat2) {
        this.slat2 = slat2;
    }
}
