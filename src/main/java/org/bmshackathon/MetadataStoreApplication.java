package org.bmshackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MetadataStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetadataStoreApplication.class, args);
    }
}
