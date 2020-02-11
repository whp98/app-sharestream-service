package xyz.intellij.appsharestream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("xyz.intellij.appsharestream.mapper")
@SpringBootApplication
public class AppSharestreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppSharestreamApplication.class, args);
    }

}
