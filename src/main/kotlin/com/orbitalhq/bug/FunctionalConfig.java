package com.orbitalhq.bug;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@Configuration
public class FunctionalConfig {
    @Bean
    public Function<String, String> uppercase() {
        return input -> input.toUpperCase();
    }

    @Bean
    public Function<Flux<String>, Flux<String>> uppercaseFlux() {
        return flux -> flux.map(value -> value.toUpperCase());
    }
}
