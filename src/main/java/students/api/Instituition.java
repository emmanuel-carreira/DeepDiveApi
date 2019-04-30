package students.api;

import lombok.Value;

import java.time.LocalDate;

@Value(staticConstructor = "of")
public class Instituition {
    Long id;
    String name;
    LocalDate foundationDate;
}
