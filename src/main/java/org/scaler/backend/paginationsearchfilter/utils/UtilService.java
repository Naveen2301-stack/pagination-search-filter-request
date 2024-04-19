package org.scaler.backend.paginationsearchfilter.utils;

import org.scaler.backend.paginationsearchfilter.dto.ProjectSearchAndFilterRequest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;

public class UtilService {
    // UtilService, provides a method getPageable which is intended to generate a Pageable object
    // based on a ProjectSearchAndFilterRequest object.


    public static Pageable getPageble(ProjectSearchAndFilterRequest searchRequest)
    {
        String sortBy = searchRequest.getSortBy();
        String direction = searchRequest.getDirection();
        Sort.Direction sortDirection;
        if(searchRequest.getPageNo()==null || searchRequest.getPageSize() == null)
        {
            return null;
        }
        // defaults to sorting by the id field. For direction,
        // it defaults to descending (DESC).
        if(searchRequest.getSortBy()==null || searchRequest.getSortBy().isBlank())
        {
            sortBy = "id";
        }
        if(searchRequest.getDirection() == null || searchRequest.getDirection().isBlank()){
            direction = "DESC";
        }
        sortDirection = Sort.Direction.fromString(direction);
        //PageRequest object using the provided
        // page number, page size, sorting direction, and sorting field
        return (Pageable) PageRequest.of(searchRequest.getPageNo(), searchRequest.getPageSize(), sortDirection, sortBy);


    }
}
