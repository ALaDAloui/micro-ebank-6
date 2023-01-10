package org.sid.bankaccountservice.Dto;


import lombok.Data;
import org.sid.bankaccountservice.entities.enums.AccStatus;

import java.util.Date;

@Data
public class SavingACcountDto extends BankAccountDto {
    private  String id ;

    private  double interestRate ;
    private Date createdAt ;
    private double balance ;
    private AccStatus status ;
    private String currency ;
    private String description ;

    private Long customerId ;
}
