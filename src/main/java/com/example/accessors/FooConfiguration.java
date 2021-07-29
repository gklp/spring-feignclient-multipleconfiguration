package com.example.accessors;

import feign.Feign;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class FooConfiguration {

    public RequestInterceptor interceptor() {
        return requestTemplate -> System.out.println("Foo fired!");
    }

    @Bean
    public Feign.Builder fooBuilder() {
        return Feign.builder().requestInterceptor(interceptor());
    }

}
