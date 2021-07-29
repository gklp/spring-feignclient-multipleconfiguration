package com.example.accessors;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        contextId = "client2",
        name = "client2",
        url = "http://echo.jsontest.com",
        configuration = {BarConfiguration.class}
)
public interface BarApiClient extends BarApi
{

}
