package com.jsp.VotingApplication.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@Data
@ToString
@Entity
public class Voter {
	private String firstName;
	private String lastName;
	@Id
	private String email;
	private String password;
	private String phone;
	private String gender;
	private String dob;
	private String adhaar_num;
	private String panNum;
	private String adress;
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Status;
}
