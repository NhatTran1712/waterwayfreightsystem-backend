package org.apptopia.waterwayfreightsystem.api.api.application.usecases.account;

import javax.persistence.Transient;

import org.apptopia.waterwayfreightsystem.api.api.application.usecases.UseCaseOutput;
import org.apptopia.waterwayfreightsystem.api.api.authentication.AccountType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
public class RawAccountOutput implements UseCaseOutput{
	
	private Long idUser;
	private String username;
	private String password;
	@Transient
    private String passwordConfirm;
    private AccountType accountType;
	private String fullname;
	private String address;
	private String phoneNumber;
	private String idCard;
}
