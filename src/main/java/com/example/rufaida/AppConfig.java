package com.example.rufaida;

import org.kohsuke.github.GitHub;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@ComponentScan
public class AppConfig
{
    @Bean
    GitHub gitHub() throws IOException {
        return GitHub.connectUsingOAuth("072afd7f2cc84b6105e1fd9e62b0c382ee25bc0d");
    }
    @Bean
    ApplicationRunner applicationRunner(ApplicationContext applicationContext) {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                System.out.println("Foo");
                for(String name :applicationContext.getBeanDefinitionNames() )
                System.out.println( name);
            }
        };

    }

}
