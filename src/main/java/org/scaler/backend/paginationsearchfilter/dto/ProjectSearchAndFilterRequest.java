package org.scaler.backend.paginationsearchfilter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProjectSearchAndFilterRequest extends PaginationRequest {
    // this is the lookup text for search
    private String searchText;
    private Date startDate;
    private Date endDate;
}
