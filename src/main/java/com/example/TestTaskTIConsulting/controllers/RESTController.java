package com.example.TestTaskTIConsulting.controllers;

import com.example.TestTaskTIConsulting.StringSplitter;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class RESTController {

    @GetMapping("/{inputString}")
    public String getCharCount(@PathVariable String inputString) {
        return "" + StringSplitter.stringSplit(inputString);
    }
}
