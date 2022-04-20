package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok("Hello from demo-2");
    }

    @PostMapping("/message/{id}")
    public ResponseEntity<?> message(@PathVariable("id") Integer id) {
        MessageDTO dto = new MessageDTO();
        dto.setId(id);
        dto.setMessage("Message from demo-2");
        return ResponseEntity.ok(dto);
    }
}
