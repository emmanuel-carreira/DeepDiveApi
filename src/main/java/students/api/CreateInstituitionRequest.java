package students.api;

import lombok.Value;

import java.time.LocalDate;

@Value(staticConstructor = "of")
public class CreateInstituitionRequest {

    String name;
    LocalDate foundationDate;
}
