package org.scaler.backend.paginationsearchfilter.controllers;

import io.swagger.annotations.Api;
import org.scaler.backend.paginationsearchfilter.dto.ProjectSearchAndFilterRequest;
import org.scaler.backend.paginationsearchfilter.model.Project;
import org.scaler.backend.paginationsearchfilter.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @PostMapping("create")
    public ResponseEntity<Long> createProject(@RequestBody Project project)
    {
        try{
            return ResponseEntity.ok(projectService.createProject(project));
        }catch (Exception e)
        {
            throw new RuntimeException( e.getMessage());
        }
    }
    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects()
    {
        try{
            return  ResponseEntity.ok(projectService.getAllProjects());
        }catch (Exception e)
        {
            throw  new RuntimeException(e.getMessage());
        }
    }
    @GetMapping("/{id}") // pagination api call
    public ResponseEntity<Optional<Project>> getProjectByID(@PathVariable Long id)
    {
        try{
            return ResponseEntity.ok(projectService.getProjectById(id));
        }catch (Exception e)
        {
            throw new RuntimeException(e.getMessage());
        }
    }
    @PostMapping("/pages")
    public ResponseEntity<Page<Project>> getProjectById(@RequestBody ProjectSearchAndFilterRequest searchRequest){
        try{
            return ResponseEntity.ok(projectService.searchAndFilterProject(searchRequest));
        } catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }


}
