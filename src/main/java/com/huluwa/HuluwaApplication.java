package com.huluwa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jack.wu
 */

// @EnableScheduling
@MapperScan(value = "com.huluwa.mapper")
@SpringBootApplication
public class HuluwaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuluwaApplication.class, args);
    }

}
