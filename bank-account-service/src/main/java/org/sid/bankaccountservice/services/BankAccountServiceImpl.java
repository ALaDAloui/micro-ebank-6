package org.sid.bankaccountservice.services;

import lombok.AllArgsConstructor;
import org.sid.bankaccountservice.Dto.BankAccountDto;
import org.sid.bankaccountservice.Dto.CurrentAccountDto;
import org.sid.bankaccountservice.Dto.SavingACcountDto;
import org.sid.bankaccountservice.daos.BankAccountRepository;
import org.sid.bankaccountservice.entities.BankAccount;
import org.sid.bankaccountservice.entities.CurrentAccount;
import org.sid.bankaccountservice.entities.SavingAccount;
import org.sid.bankaccountservice.entities.enums.AccStatus;
import org.sid.bankaccountservice.entities.model.Customer;
import org.sid.bankaccountservice.mappers.MapperService;
import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Transactional
@AllArgsConstructor
public class BankAccountServiceImpl implements BankAccountService{

    private  BankAccountRepository bankAccountRepository ;

    @Override
    public CurrentAccountDto saveCurrentAccount(Long customerId, Double overdraft, Double initialBalance, String currency, String desciption) {
        return null;
    }

    @Override
    public SavingACcountDto saveSavingAccount(Long customerId, Double interestRate, Double initialBalance, String currency, String desciption) {
        return null;
    }

    @Override
    public List<BankAccountDto> getBankAccountByCustomer(Long customerId) {
        return null;
    }
}
