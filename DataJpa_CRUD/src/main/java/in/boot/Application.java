package in.boot;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.boot.entity.Student;
import in.boot.repository.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		
		StudentRepo stRepo=context.getBean(StudentRepo.class);
		
		Student st=new Student();
		st.setName("jaya");
		st.setAddress("ngpur");
		stRepo.save(st);			//save method
			
		
		
//		List<Student> list=(List<Student>)stRepo.findAll();
//		list.forEach(Student -> System.out.println(Student));
		
		Student st1=stRepo.findById(1).get();
		System.out.println(st1);
		
		
//		st1.setName("ajay");
//		st1.setAddress("nagpur");
//		Student updatedStudent=stRepo.save(st1);
//		
//		System.out.println("updated");
//		System.out.println(updatedStudent);
		
		stRepo.delete(st);
		System.out.println("deleted data");
	}

}
