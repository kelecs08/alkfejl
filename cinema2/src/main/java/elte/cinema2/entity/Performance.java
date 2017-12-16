package elte.cinema2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
public class Performance extends BaseEntity {
    
    @Column(nullable = false)
    private Date startingTime;
    
    @JoinColumn
    @ManyToOne(targetEntity = Film.class)
    private Film film;
    
    @JoinColumn
    @ManyToOne(targetEntity = Room.class)
    private Room room;
    
    @JsonIgnore    
    @OneToMany(targetEntity = Seat.class, cascade = CascadeType.ALL, mappedBy = "performance")
    private List<Seat> seats;
    
}
