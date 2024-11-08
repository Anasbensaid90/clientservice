package com.anasdev.tp2_clientservice;

import com.anasdev.tp2_clientservice.model.Client;
import com.anasdev.tp2_clientservice.repo.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Tp2ClientserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp2ClientserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository) {
        return args -> {
            Stream.of(
                    Client.builder().name("Joe").build(),
                    Client.builder().name("William").build(),
                    Client.builder().name("Jack").build(),
                    Client.builder().name("Averell").build()
            ).forEach(clientRepository::save);

            clientRepository.findAll().forEach(System.out::println);
        };
    }
}

