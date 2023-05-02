package com.poc.feing.AppOne.client;

import com.poc.feing.AppOne.dto.FirstDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "${app.receive.name}", url = "${app.receive.url}",
configuration = FeignClientProperties.FeignClientConfiguration.class)
public interface ClientReceive {

    @PostMapping(value = "/receive")
    ResponseEntity<String> sendDto(@RequestBody FirstDto firstDto);
}
