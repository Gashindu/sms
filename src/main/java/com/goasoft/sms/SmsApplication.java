package com.goasoft.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.goasoft.sms.model.Student;
import com.goasoft.sms.repository.StudentRepository;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Gideon", "Omondi", "gomondi@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Tierry", "Henry", "thenry@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Alsono", "Cladly", "acladly@gmail.com");
//		studentRepository.save(student3);
		
	}
	
	

}
