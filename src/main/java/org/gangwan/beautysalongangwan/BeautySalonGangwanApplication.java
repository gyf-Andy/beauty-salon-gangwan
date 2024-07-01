package org.gangwan.beautysalongangwan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.gangwan") //看这个包下的类有没有bean注解    描到有@Component、@Controller、@Service等这些注解的类，并注册为Bean，
@MapperScan("org.gangwan.mapper") //使org.gangwan.mapper生成代理
public class BeautySalonGangwanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeautySalonGangwanApplication.class, args);
    }

}
