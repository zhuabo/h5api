package top.zhanghb.h5api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties("secret.yml")
public class H5apiApplication {

    public static void main(String[] args) {
        SpringApplication.run(H5apiApplication.class, args);
    }

}
