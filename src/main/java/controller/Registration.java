package controller;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="registration")
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int registrationId;
	
	@Column
	private String name;
	
	@Column
	private String emailId;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dateOfBith;
	
	@Column
	private String gender;
	
	@Column
	private String password;
	
	@Column
	private String confirmPassword;
	
	@Column
	private String status;
	
	@Column
	private String description;
	
	@Column
	private String role;
	
	public int getRegistrationId() {
		return this.registrationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDateOfBith() {
		return dateOfBith;
	}

	public void setDateOfBith(Date dateOfBith) {
		this.dateOfBith = dateOfBith;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	
	
	
}
