package in.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.boot.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
