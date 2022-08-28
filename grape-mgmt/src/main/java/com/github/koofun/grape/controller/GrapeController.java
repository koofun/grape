package com.github.koofun.grape.controller;

import com.github.koofun.grape.annotation.GrapeToken;
import com.github.koofun.grape.validator.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Validated
@GrapeToken
@RestController
@RequestMapping("/v1/grape")
public class GrapeController {
    @PostMapping
    ResponseEntity<String> add(@RequestAttribute HttpServletRequest request, @RequestBody @Validated String body) {

        return new ResponseEntity<>("", HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<String> get(@RequestAttribute HttpServletRequest request, @PathVariable @UUID String id) {

        return new ResponseEntity<>("", HttpStatus.OK);
    }

    @DeleteMapping
    ResponseEntity<String> delete(@RequestAttribute HttpServletRequest request, @PathVariable @UUID String id) {

        return new ResponseEntity<>("", HttpStatus.NO_CONTENT);
    }
}
