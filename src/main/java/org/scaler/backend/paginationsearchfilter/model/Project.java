package org.scaler.backend.paginationsearchfilter.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Lazy;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
@Table(name = "PROJECTS")
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private  Long id;
    private String projectName;
    private String description;
    private Date startDate;
    private Date endDate;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Contributor> contributors;
}
