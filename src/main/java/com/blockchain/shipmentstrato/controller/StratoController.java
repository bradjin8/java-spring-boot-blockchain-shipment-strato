package com.blockchain.shipmentstrato.controller;

import com.blockchain.shipmentstrato.model.strato.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/strato")
public class StratoController {

    @GetMapping("")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/users")
    public ResponseEntity<List<Account>> getUsers() {
        List<Account> users = new ArrayList<>();

        return ResponseEntity.ok(users);
    }
}