package com.example.etudiantv1.Client;

import com.example.etudiantv1.DTO.FilliereDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="filiere-service" ,url="http://localhost:8082")
public interface FilliereClient {
    @GetMapping("/api/v1/fillieres/{id}")
    FilliereDto getFiliereById(@PathVariable("id") Integer id);
}
