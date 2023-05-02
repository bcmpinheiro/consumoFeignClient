package com.poc.feing.AppOne.controller;

import com.poc.feing.AppOne.client.ClientReceive;
import com.poc.feing.AppOne.dto.FirstDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send")
public class SendController {

    @Autowired
    ClientReceive clientReceive;

    @PostMapping
    public ResponseEntity<FirstDto> sendController(@RequestBody FirstDto firstDto) {

        clientReceive.sendDto(firstDto);

        return ResponseEntity.ok().body(firstDto);
    }
}
