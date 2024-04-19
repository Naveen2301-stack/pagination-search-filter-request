package org.scaler.backend.paginationsearchfilter.repositories;

import org.scaler.backend.paginationsearchfilter.model.Contributor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributorRepo extends CrudRepository<Contributor,Long> {

}
