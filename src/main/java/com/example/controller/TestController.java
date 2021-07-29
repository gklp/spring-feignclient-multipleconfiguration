package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessors.BarApiClient;
import com.example.accessors.FooApiClient;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController
{

    private final FooApiClient fooApiClient;

    private final BarApiClient barApiClient;

    @GetMapping("/foo")
    public ResponseEntity<String> fooApiTest() {
        return fooApiClient.getTest();
    }

    @GetMapping("/bar")
    public ResponseEntity<String> barApiTest() {
        return barApiClient.getTest();
    }

}
