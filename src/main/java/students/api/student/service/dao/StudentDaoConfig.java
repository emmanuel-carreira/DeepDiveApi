package students.api.student.service.dao;

import org.jdbi.v3.core.Jdbi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentDaoConfig {
    @Bean
    public StudentDao studentDao(Jdbi jdbi) { return jdbi.onDemand(StudentDao.class); }
}
