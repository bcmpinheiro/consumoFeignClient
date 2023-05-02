package com.poc.feing.AppTwo.controller;

import com.poc.feing.AppTwo.dto.SecondDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("receive")
public class ReceiveController {

    @PostMapping
    public ResponseEntity<String> receive(@RequestBody SecondDto secondDto) {

        System.out.println(secondDto);

        return ResponseEntity.ok().body("sucess");
    }
}
