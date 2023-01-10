package org.sid.bankaccountservice.services;

import org.sid.bankaccountservice.Dto.BankAccountDto;
import org.sid.bankaccountservice.Dto.CurrentAccountDto;
import org.sid.bankaccountservice.Dto.SavingACcountDto;
import org.sid.bankaccountservice.entities.BankAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BankAccountService {

    public CurrentAccountDto saveCurrentAccount(Long customerId ,Double overdraft, Double initialBalance , String currency , String desciption) ;


    public SavingACcountDto saveSavingAccount(Long customerId ,Double interestRate, Double initialBalance , String currency , String desciption) ;


    List<BankAccountDto> getBankAccountByCustomer (Long customerId ) ;




}
