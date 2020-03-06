package edu.mum.cs.cs425.studentmgmt.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import com.sun.istack.NotNull;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentId;
	@Column(nullable = false) @NotNull @NotEmpty @NotBlank
	private String studentNumber;
	@Column(nullable = false) @NotNull @NotEmpty @NotBlank
	private String firstName;
	private String middleName;
	@Column(nullable = false) @NotNull @NotEmpty @NotBlank
	private String lastName;
	private double cgpa;
	@Column(nullable = false) @NotNull @NotEmpty @NotBlank
	private LocalDate dateOfEnrollment;
	@OneToOne
	@JoinColumn(name = "transcript_id")
	private Transcript transcript;
	public Student() {}
	public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa,
			LocalDate dateOfEnrollment) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
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
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}
	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}
	public Transcript getTranscript() {
		return transcript;
	}
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment="
				+ dateOfEnrollment + "]";
	}
}
