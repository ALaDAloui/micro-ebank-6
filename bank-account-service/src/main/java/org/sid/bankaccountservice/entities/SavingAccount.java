package org.sid.bankaccountservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue("SAV")
public class SavingAccount extends BankAccount{

    private  double interestRate ;

}
