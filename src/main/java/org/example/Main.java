package org.example;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

@SpringBootApplication()
public class Main implements CommandLineRunner {
    private final SecretClient secretClient;

    public Main(SecretClient secretClient) {
        this.secretClient = secretClient;
    }

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        System.out.println("USER: " + secretClient.getSecret("user").getValue());
    }
}