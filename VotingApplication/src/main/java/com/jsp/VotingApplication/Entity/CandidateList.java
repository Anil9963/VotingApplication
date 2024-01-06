package com.jsp.VotingApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@Data
@ToString
@Entity
public class CandidateList {

	private String cName;
	private int cAge;
	@Id
	private String cEmail;
	private String cPhone;
	private String gender;
	private String cAdress;
	private String adhaarNum;
	private String panNum;
	private int monthlyIncome;
	private int yearlyIncome; 
	private int totalProperty;
	private String criminalBackground;
	private int votes;
}
