package org.sid.bankaccountservice.mappers;

import org.sid.bankaccountservice.Dto.CurrentAccountDto;
import org.sid.bankaccountservice.Dto.SavingACcountDto;
import org.sid.bankaccountservice.entities.CurrentAccount;
import org.sid.bankaccountservice.entities.SavingAccount;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class MapperService {

    public CurrentAccount fromCurrentAccountDto(CurrentAccountDto currentAccountDto){
        CurrentAccount currentAccount = new CurrentAccount()    ;
        BeanUtils.copyProperties(currentAccountDto,currentAccount);

        return currentAccount;

    }


    public CurrentAccountDto fromCurrentAccount ( CurrentAccount currentAccount) {

        CurrentAccountDto currentAccountDto = new CurrentAccountDto();
        BeanUtils.copyProperties(currentAccount,currentAccountDto);

        return  currentAccountDto;

    }

    public SavingAccount fromSavingAccountDto(SavingACcountDto savingACcountDto) {

        SavingAccount savingAccount = new SavingAccount();
        BeanUtils.copyProperties(savingACcountDto,savingAccount);
        return savingAccount;

    }

  public SavingACcountDto fromSavingAccount (SavingAccount savingAccount){

        SavingACcountDto savingACcountDto = new SavingACcountDto();
        BeanUtils.copyProperties(savingAccount,savingACcountDto);

        return savingACcountDto ;
  }


}
