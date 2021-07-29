package com.example.accessors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface BarApi
{

    @GetMapping(
            value = {"/key/value/key2/2"},
            produces = {"*/*"}
    )
    ResponseEntity<String> getTest();

}
