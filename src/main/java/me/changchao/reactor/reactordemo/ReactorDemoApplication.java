package me.changchao.reactor.reactordemo;

import java.nio.file.AccessDeniedException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class ReactorDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(ReactorDemoApplication.class, args);
  }

  @Bean
  CommandLineRunner runner() {
    return args -> {
      Mono.error(new AccessDeniedException("Access Denied")) ;
    };
  }
}
