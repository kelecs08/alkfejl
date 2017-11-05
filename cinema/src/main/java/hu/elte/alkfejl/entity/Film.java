package hu.elte.alkfejl.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Film extends BaseEntity {
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false)
    private String director;
    
    @Column(nullable = false)
    private String synopsis;
    
    @Column(nullable = false)
    private int length;
    
    @Column(nullable = false)
    private Date entryDate;
    
    @OneToMany(targetEntity = Performance.class, cascade = CascadeType.ALL, mappedBy = "film")
    private List<Performance> performances;
    
}