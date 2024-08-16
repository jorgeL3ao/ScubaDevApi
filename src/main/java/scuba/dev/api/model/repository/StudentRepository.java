package scuba.dev.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scuba.dev.api.model.entities.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
