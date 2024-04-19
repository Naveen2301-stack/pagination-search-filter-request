package org.scaler.backend.paginationsearchfilter.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
@Table(name = "CONTRIBUTORS")
@Getter
@Setter
public class Contributor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    private String name;
    private String mobile;
    private String email;
}
