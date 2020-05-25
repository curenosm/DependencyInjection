package com.curenosm.didemo.config;

import com.curenosm.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${curenosm.username}")
    String user;

    @Value("${curenosm.password}")
    String password;

    @Value("${curenosm.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();

        return propertySourcesPlaceholderConfigurer;
    }
}
