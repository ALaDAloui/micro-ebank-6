package org.sid.bankaccountservice.daos;

import org.sid.bankaccountservice.Dto.BankAccountDto;
import org.sid.bankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount,String> {

    @Query ("SELECT e FROM BankAccount e where e.customerId = : customerId")
     List<BankAccountDto> findByCustomerId(@Param(value = "customerId") Long customerId) ;

}


