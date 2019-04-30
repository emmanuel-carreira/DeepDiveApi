package students.api.student.request;

import lombok.Value;
import students.api.transients.Institution;

import java.time.LocalDate;

@Value(staticConstructor = "of")
public class CreateStudentRequest {
    String name;
    LocalDate birthDate;
    long institutionId;
}
