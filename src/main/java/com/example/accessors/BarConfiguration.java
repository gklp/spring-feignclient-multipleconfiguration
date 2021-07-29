package com.example.accessors;

import org.springframework.context.annotation.Bean;

import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;

public class BarConfiguration
{

    public RequestInterceptor interceptor()
    {
        return new RequestInterceptor()
        {
            @Override
            public void apply(RequestTemplate requestTemplate)
            {
                System.out.println("Bar fired!");
            }
        };
    }

    @Bean
    public Feign.Builder barBuilder()
    {
        return Feign.builder().requestInterceptor(interceptor());
    }

}
