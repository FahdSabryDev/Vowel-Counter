package com.example.vowelcounter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VowelController {

    @GetMapping("/api/count")
    public Map<String, Integer> countVowels(@RequestParam(name = "text", defaultValue = "") String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        Map<String, Integer> resp = new HashMap<>();
        resp.put("count", count);
        return resp;
    }
}