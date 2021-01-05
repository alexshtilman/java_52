package telran.spring.jpa.controllers;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import telran.spring.jpa.service.interfaces.Students;

@Controller

public class StudentsController {
	private static final int INIT_N_STUDENTS = 35;
	private static final int INIT_N_SUBJECTS = 20;

	private static final int MIN_MARK = 60;
	private static final int MAX_MARK = 100;

	private static final int INIT_N_MARKS = 200;
	private static final boolean UNIQUE_MARKS = false;

	private static final Logger logger = LoggerFactory.getLogger(StudentsController.class);

	@Autowired
	Students students;

	@PostConstruct
	public void initDB() {
		logger.warn("Start generating mokk data");
		students.generateRandomData(INIT_N_STUDENTS, INIT_N_SUBJECTS, INIT_N_MARKS, UNIQUE_MARKS, MIN_MARK, MAX_MARK);
		logger.warn("End generating mokk data");
	}
}
