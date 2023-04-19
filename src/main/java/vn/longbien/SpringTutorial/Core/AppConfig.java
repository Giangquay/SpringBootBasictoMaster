package vn.longbien.SpringTutorial.Core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Girl createGirl(){
        Girl girl = new Girl();
        girl.setName("Huong");
        girl.setAge(23);
        return girl;
    }
}
