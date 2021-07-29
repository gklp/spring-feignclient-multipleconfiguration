package com.example.accessors;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        contextId = "client1",
        name = "client1",
        url = "http://echo.jsontest.com",
        configuration = {FooConfiguration.class}
)
public interface FooApiClient extends FooApi
{

}
