package com.opsrabbit.demo.web;

import jakarta.validation.constraints.NotBlank;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@Validated
public class BuildInfoController {

    @GetMapping("/")
    public Map<String, Object> home(@RequestParam(defaultValue = "ci") @NotBlank String profile) {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("application", "java-maven-ci-demo");
        response.put("status", "ok");
        response.put("profile", StringUtils.lowerCase(profile));
        response.put("timestamp", Instant.now().toString());
        return response;
    }
}
