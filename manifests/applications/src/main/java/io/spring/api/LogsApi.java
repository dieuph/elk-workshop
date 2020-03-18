package io.spring.api;

import java.util.HashMap;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.spring.core.log.LogRequest;
import io.spring.core.log.LogWrapper;

@RestController
@RequestMapping(path = "logs")
public class LogsApi {

    @Autowired
    public LogsApi() {
    }

    @PostMapping
    public ResponseEntity<?> writeLogs(@Valid @RequestBody LogRequest logRequest) {
    	 LogWrapper.from(logRequest).log();
       return ResponseEntity.ok("Print log successfully");
    }

}


