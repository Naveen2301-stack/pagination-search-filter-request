package org.scaler.backend.paginationsearchfilter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PaginationRequest {
    private Integer pageNo; // parameters for pagination
    private Integer pageSize; // parameters for pagination
    private String sortBy;
    private String direction;

}
