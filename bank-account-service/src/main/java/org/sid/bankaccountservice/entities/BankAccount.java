package org.sid.bankaccountservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.bankaccountservice.entities.enums.AccStatus;
import org.sid.bankaccountservice.entities.model.Customer;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@DiscriminatorColumn(name = "TYPE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BankAccount {

    @Id
    private  String id ;
    private Date createdAt ;
    private double balance ;
    private AccStatus status ;
    private String currency ;
    private String description ;

    private Long customerId ;
    @Transient
    private Customer customer ;



}
