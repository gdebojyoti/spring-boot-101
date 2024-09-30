package com.debojyotighosh.spring_101.artifact.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.debojyotighosh.spring_101.artifact.DB;
import com.debojyotighosh.spring_101.artifact.DevDB;
import com.debojyotighosh.spring_101.artifact.ProdDB;

@Configuration
public class AppConfig {
  @Bean
  @ConditionalOnProperty(name = "project.mode", havingValue = "development")
  public DB getDevDBBean() {
    return new DevDB();
  }
  
  @Bean
  @ConditionalOnProperty(name = "project.mode", havingValue = "production")
  public DB getProdDBBean() {
    return new ProdDB();
  }

}
