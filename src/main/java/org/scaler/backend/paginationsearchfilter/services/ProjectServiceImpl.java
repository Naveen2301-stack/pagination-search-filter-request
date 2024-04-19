package org.scaler.backend.paginationsearchfilter.services;

import org.scaler.backend.paginationsearchfilter.dto.ProjectSearchAndFilterRequest;
import org.scaler.backend.paginationsearchfilter.model.Project;
import org.scaler.backend.paginationsearchfilter.repositories.ProjectRepository;
import org.scaler.backend.paginationsearchfilter.utils.UtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProjectServiceImpl implements ProjectService{
    @Autowired
    ProjectRepository projectRepository;
    @Override
    public Long createProject(Project project) {
        return projectRepository.save(project).getId();
    }

    @Override
    public List<Project> getAllProjects() {
        return (List<Project>) projectRepository.findAll();
    }

    @Override
    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Page<Project> searchAndFilterProject(ProjectSearchAndFilterRequest searchRequest) {
       Pageable pageable = (Pageable) UtilService.getPageble(searchRequest);
       String  searchText = searchRequest.getSearchText();
       if(searchRequest.getSearchText()!=null)
       {
           searchText = "%" + searchText + "%";
       }
       return projectRepository.search(searchText,searchRequest.getStartDate(),searchRequest.getEndDate(),pageable);
    }
}
