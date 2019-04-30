package students.api.student.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import students.api.institution.response.CreateInstitutionResponse;
import students.api.student.request.CreateStudentRequest;
import students.api.student.response.CreateStudentResponse;
import students.api.student.service.StudentService;
import students.api.transients.Institution;
import students.api.transients.Student;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class StudentController {
    private final StudentService service;

    @RequestMapping(path = "/students", method = RequestMethod.POST)
    public CreateStudentResponse createStudent(@RequestBody CreateStudentRequest request) {

        final Student std = Student.builder().name(request.getName()).born(request.getBirthDate()).institution(request.getInstitutionId()).build();
        final long studentId = service.insertStudent(std);
        return CreateStudentResponse.of(studentId);
    }
}
