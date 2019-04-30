package students.api;

import java.time.LocalDate;

import lombok.Value;

@Value(staticConstructor = "of")
public class Student {
    Long id;
    String name;
    LocalDate birthDate;
}