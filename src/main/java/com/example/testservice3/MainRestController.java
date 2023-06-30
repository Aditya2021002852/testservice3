package com.example.testservice3;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @GetMapping("/")
    public ResponseEntity<String> greet() {
        String str = "Hello from test service 2";
        return ResponseEntity.ok(str);
    }

}
