package com.spark.lms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "member")
public class Member implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@NotEmpty(message = "*Please select member type")
	@NotNull(message = "*Please select member type")
	@Column(name = "type")
	private String type;
	
	@NotEmpty(message = "*Please enter fisrt name")
	@NotNull(message = "*Please enter fisrt name")
	@Column(name = "first_name")
	private String firstName;
	
	@NotEmpty(message = "*Please enter middle name")
	@NotNull(message = "*Please enter middle name")
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@NotEmpty(message = "*Please select gender")
	@NotNull(message = "*Please select gender")
	@Column(name = "gender")
	private String gender;
	
	@NotNull(message = "*Please enter birth date")
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "joining_date")
	private Date joiningDate;
	@NotNull
	@Pattern(regexp="(^$|[0-9]{10})", message = "*phone_no should be Numbers.")
	@Size(min=10,max=10, message = "*phone_no should be exact 10 characters.")
	@Column(name = "contact")
	
	private String contact;
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE,
            message = "*Please enter correct Email.") 
	@Column(name = "email")
	private String email;
	@Column(nullable = true, length = 64)
    private String photos;
	
	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public Member(@NotNull String type, @NotNull String firstName, @NotNull String middleName, @NotNull String lastName,
			@NotNull String gender, @NotNull Date dateOfBirth, @NotNull Date joiningDate, @NotNull String photos) {
		super();
		this.type = type;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.joiningDate = joiningDate;
	}
	
	public Member() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
