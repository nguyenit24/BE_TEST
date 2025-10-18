package com.example.MovieTicker.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StartupLogger implements CommandLineRunner {

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @Value("${spring.datasource.username}")
    private String datasourceUsername;

    @Value("${MYSQLHOST:NOT_SET}")
    private String mysqlHost;

    @Value("${MYSQLPORT:NOT_SET}")
    private String mysqlPort;

    @Value("${MYSQLDATABASE:NOT_SET}")
    private String mysqlDatabase;

    @Value("${MYSQLUSER:NOT_SET}")
    private String mysqlUser;

    @Override
    public void run(String... args) {
        log.info("========================================");
        log.info("DATABASE CONFIGURATION");
        log.info("========================================");
        log.info("Datasource URL: {}", datasourceUrl);
        log.info("Datasource Username: {}", datasourceUsername);
        log.info("MYSQLHOST: {}", mysqlHost);
        log.info("MYSQLPORT: {}", mysqlPort);
        log.info("MYSQLDATABASE: {}", mysqlDatabase);
        log.info("MYSQLUSER: {}", mysqlUser);
        log.info("========================================");
    }
}