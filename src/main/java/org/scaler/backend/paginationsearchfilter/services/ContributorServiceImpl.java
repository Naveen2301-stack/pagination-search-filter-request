package org.scaler.backend.paginationsearchfilter.services;

import org.scaler.backend.paginationsearchfilter.model.Contributor;
import org.scaler.backend.paginationsearchfilter.repositories.ContributorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContributorServiceImpl implements ContributorService{

    @Autowired
    private ContributorRepo contributorRepo;

    @Override
    public Long createContributor(Contributor contributor) {
        return contributorRepo.save(contributor).getId();
    }

    @Override
    public List<Contributor> getAllContributors() {
        return (List<Contributor>) contributorRepo.findAll();
    }

    @Override
    public Optional<Contributor> getContributorById(Long id) {
        return contributorRepo.findById(id);
    }
}
