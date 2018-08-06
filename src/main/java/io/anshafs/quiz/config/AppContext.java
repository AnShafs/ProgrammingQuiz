package io.anshafs.quiz.config;

import io.anshafs.quiz.model.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("io.anshafs.quiz")
public class AppContext extends WebMvcConfigurerAdapter{
    @Bean
    public Message message(){
        return new Message("Hello world!");
    }
}
