package students.api.student.response;

import lombok.Value;

@Value(staticConstructor = "of")
public class CreateStudentResponse {
    Long id;
}
