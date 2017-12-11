package elte.cinema2.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.Data;

@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE)
    private Long id;
	
    @Version
    private int version;
	
}
