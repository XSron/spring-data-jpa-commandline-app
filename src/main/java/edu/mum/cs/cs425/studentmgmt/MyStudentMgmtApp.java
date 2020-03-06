package edu.mum.cs.cs425.studentmgmt;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.IClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.IStudentRepository;
import edu.mum.cs.cs425.studentmgmt.repository.ITranscriptRepository;

@SpringBootApplication
public class MyStudentMgmtApp implements CommandLineRunner{
	@Autowired
	private IStudentRepository studentRepository;
	@Autowired
	private ITranscriptRepository transcriptRepository;
	@Autowired
	private IClassroomRepository classroomRepository;
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtApp.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Transcript transcript1 = new Transcript("Master of Computer Science");
		transcriptRepository.save(transcript1);
		Transcript transcript2 = new Transcript("Phd of Computer Science");
		transcriptRepository.save(transcript2);
		
		Student student1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.now());
		student1.setTranscript(transcript1);
		studentRepository.save(student1);
		
		Student student2 = new Student("000-61-0001", "Joe", "Lynn", "Smith", 4.00, LocalDate.now());
		student2.setTranscript(transcript2);
		studentRepository.save(student2);
		
		List<Student> students = Arrays.asList(student1, student2);
		Classroom classroom = new Classroom("McLaughlin building", "M105", students);
		classroomRepository.save(classroom);
	}

}
