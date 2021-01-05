package telran.spring.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.spring.jpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
