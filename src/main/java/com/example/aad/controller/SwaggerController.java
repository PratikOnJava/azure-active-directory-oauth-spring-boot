package com.example.aad.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SwaggerController {

    @PostMapping ("/loadPartners")
    @Tag(name="Single Ingestion", description = "Performs partner data ingestion from list of ids")
    public String loadPartners(@RequestBody List<String> partnerIds) {
        return "Successfully ingested data from list of ids";
    }

    @PostMapping ("/loadAllPartnerFromOrator")
    @Tag(name="Bulk Ingestion", description = "Performs bulk load of all partner data from Orator")
    public String loadAllPartnerFromOrator(@RequestBody String filepath) {
        return "Successfully ingested the bulk load from Orator";
    }

    @PostMapping ("/loadAllPartnerFromFile")
    @Tag(name="File Ingestion ", description = "Performs bulk load of all partner data from file containing list of ids")
    public String loadAllPartnerFromFile(@RequestBody String filepath) {
        return "Successfully ingested the bulk load from File";
    }
}
