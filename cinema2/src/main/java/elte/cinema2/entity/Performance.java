package elte.cinema2.entity;

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
    
/*    @Column(nullable = false)
    private String filmTitle;*/
    
    @Column(nullable = false)
    private Date startingTime;
    
/*    @Column(nullable = false)
    private String roomName;*/
    
    @JoinColumn
    @ManyToOne(targetEntity = Film.class)
    private Film film;
    
    @JoinColumn
    @ManyToOne(targetEntity = Room.class)
    private Room room;
    
//    @JoinColumn
    @OneToMany(targetEntity = Seat.class, cascade = CascadeType.ALL, mappedBy = "performance")
    private List<Seat> seats;
    
 /*   @JoinColumn
    @ManyToMany(targetEntity = User.class)
    private List<User> users;*/
    
    
}
