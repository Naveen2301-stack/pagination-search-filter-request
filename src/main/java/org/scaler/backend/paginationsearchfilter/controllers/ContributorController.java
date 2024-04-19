package org.scaler.backend.paginationsearchfilter.controllers;

import jakarta.persistence.Entity;
import org.apache.coyote.Response;
import org.scaler.backend.paginationsearchfilter.model.Contributor;
import org.scaler.backend.paginationsearchfilter.services.ContributorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/contributors")
public class ContributorController {
    @Autowired
    ContributorService contributorService;
    @PostMapping("create")
    public ResponseEntity<Long> createContributor(@RequestBody Contributor contributor)
    {
        try{
            return ResponseEntity.ok(contributorService.createContributor(contributor));
        }catch (Exception e)
        {
            throw  new RuntimeException(e.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<List<Contributor>> getAllContributors()
    {
        try{
            return  ResponseEntity.ok(contributorService.getAllContributors());
        }catch (Exception e)
        {
            throw  new RuntimeException( e.getMessage());
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Contributor>> getContributorById(@PathVariable Long id)
    {
        try {
            return ResponseEntity.ok(contributorService.getContributorById(id));
        }catch (Exception e)
        {
            throw  new RuntimeException(e.getMessage());
        }
    }

}
