package students.api.student.service.dao;

import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import students.api.transients.Student;

public interface StudentDao {

    @SqlUpdate("INSERT INTO public.student (name, born, institution_id) VALUES (:name, :born, :institution)")
    @GetGeneratedKeys
    long insertStudent(@BindBean Student student);
}
