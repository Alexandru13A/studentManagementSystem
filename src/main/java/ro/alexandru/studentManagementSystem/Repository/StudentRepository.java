package ro.alexandru.studentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.alexandru.studentManagementSystem.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
