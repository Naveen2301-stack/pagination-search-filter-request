package org.scaler.backend.paginationsearchfilter.services;

import org.scaler.backend.paginationsearchfilter.model.Contributor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface ContributorService {
    Long createContributor(Contributor contributor);
    List<Contributor> getAllContributors();
    Optional<Contributor> getContributorById(Long id);
}
