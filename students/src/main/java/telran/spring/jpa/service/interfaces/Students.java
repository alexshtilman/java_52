package telran.spring.jpa.service.interfaces;

import telran.spring.jpa.dto.MarkDto;
import telran.spring.jpa.dto.StudentDto;
import telran.spring.jpa.dto.SubjectDto;

public interface Students {

	void addStudent(StudentDto studentDto);

	void addSubject(SubjectDto subjectDto);

	void addMark(MarkDto markDto);

	void generateRandomData(int nStudents, int nSubjects, int nMarks, boolean uniqueMarks, int minMark, int maxMark);
}
