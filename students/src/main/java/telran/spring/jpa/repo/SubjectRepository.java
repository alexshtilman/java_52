package telran.spring.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.spring.jpa.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
