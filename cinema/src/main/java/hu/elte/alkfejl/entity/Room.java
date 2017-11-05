package hu.elte.alkfejl.entity;

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
public class Room extends BaseEntity{
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private int rowsNumber;
    
    @Column(nullable = false)
    private int columnsNumber;
    
    @OneToMany(targetEntity = Performance.class, cascade = CascadeType.ALL, mappedBy = "room")
    private List<Performance> performances;
    
}
