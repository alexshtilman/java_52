package telran.spring.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.spring.jpa.entities.Mark;

public interface MarkRepository extends JpaRepository<Mark, Integer> {

}
