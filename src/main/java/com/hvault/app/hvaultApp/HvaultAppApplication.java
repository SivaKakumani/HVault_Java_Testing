package com.hvault.app.hvaultApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class HvaultAppApplication implements CommandLineRunner {

    @Autowired
    private VaultConfig vaultConfiguration;
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(HvaultAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Print the credentials to the console
        System.out.println("Username: " + vaultConfiguration.getUsername());
        System.out.println("Password: " + vaultConfiguration.getPassword());
        
        // Test database connection
        jdbcTemplate.execute("SELECT 1");
        System.out.println("Database connection test successful!");
    }
}
