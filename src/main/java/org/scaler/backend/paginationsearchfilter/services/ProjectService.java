package org.scaler.backend.paginationsearchfilter.services;

import org.scaler.backend.paginationsearchfilter.dto.ProjectSearchAndFilterRequest;
import org.scaler.backend.paginationsearchfilter.model.Project;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ProjectService{
    Long createProject(Project project);

    List<Project> getAllProjects();
    Optional<Project> getProjectById(Long id);

    Page<Project> searchAndFilterProject(ProjectSearchAndFilterRequest searchRequest);
}
