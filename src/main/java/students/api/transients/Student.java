package students.api.transients;

import java.time.LocalDate;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class Student {
  Long id;
  @NonNull String name;
  @NonNull LocalDate born;
  long institution;
}
