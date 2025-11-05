package com.example.fillierev1;

import com.example.fillierev1.Configuration.RsaKeys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeys.class)
public class FilliereV1Application {

    public static void main(String[] args) {
        SpringApplication.run(FilliereV1Application.class, args);
    }

}
