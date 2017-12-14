package elte.cinema2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Seat extends BaseEntity {
    
    @JoinColumn
    @ManyToOne(targetEntity = Performance.class)
    private Performance performance;
    
    @JoinColumn
    @ManyToOne(targetEntity = Room.class)
    private Room room;
    
    @Column(nullable = false)
    private int rowNumber;
    
    @Column(nullable = false)
    private int columnNumber;
    
    @Column(nullable = false)
    private Status status;
    
    @Column(nullable = false)
    private String bookingName;
    
    @Column(nullable = false)
    private long bookingTelephoneNumber;
    
    @Column
    private String bookingEmail;
    
    public enum Status {
        EMPTY, RESERVED, SOLD
    }
}
