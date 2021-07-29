package com.example.accessors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface FooApi
{

    @GetMapping(
            value = {"/key/value/key1/1"},
            produces = {"*/*"}
    )
    ResponseEntity<String> getTest();

}
