package org.apptopia.waterwayfreightsystem.api.api.authentication.account;

import org.apptopia.waterwayfreightsystem.api.api.authentication.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
	Optional<Account> findByUsername(String username);
	default Optional<Account> findOne(Long idUser) {
		return findById(idUser);
	}
//	List<Account> findByAccountType(AccountType accountType);
	List<Account> findAll();
	List<Account> findByFullnameContaining(String fullname);
	Boolean existsByUsername(String username);
//	Boolean existsByEmail(String email);
}