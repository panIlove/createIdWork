package com.ll.snowflake.com.ll.snowFlake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GetSnowFlakeProperties.class)
public class BossAutoConfiguration {

    @Autowired
    private GetSnowFlakeProperties properties;


    @Bean
    @ConditionalOnMissingBean
    public SnowflakeManager snowflakeManager() {
        return new SnowflakeManager(this.properties.getSnowFlake().getMachineId(), this.properties.getSnowFlake().getDataCenter());
    }
}
