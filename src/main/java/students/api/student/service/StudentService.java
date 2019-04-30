package students.api.student.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import students.api.student.service.dao.StudentDao;
import students.api.transients.Student;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StudentService {
    private final StudentDao dao;
    public long insertStudent(Student student){ return dao.insertStudent(student); }
}
