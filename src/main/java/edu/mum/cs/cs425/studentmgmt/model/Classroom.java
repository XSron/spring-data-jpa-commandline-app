package edu.mum.cs.cs425.studentmgmt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "classrooms")
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long classroomId;
	@Column(nullable = false) @NotNull @NotEmpty @NotBlank
	private String buildingName;
	@Column(nullable = false) @NotNull @NotEmpty @NotBlank
	private String roomNumber;
	@OneToMany
	private List<Student> student;
	public Classroom() {}
	public Classroom(@NotNull @NotEmpty @NotBlank String buildingName, @NotNull @NotEmpty @NotBlank String roomNumber,
			List<Student> student) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
		this.student = student;
	}
	public long getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(long classroomId) {
		this.classroomId = classroomId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Classroom [classroomId=" + classroomId + ", buildingName=" + buildingName + ", roomNumber=" + roomNumber
				+ "]";
	}
}
