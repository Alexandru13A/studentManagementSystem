package ro.alexandru.studentManagementSystem.Service;

import org.springframework.stereotype.Service;
import ro.alexandru.studentManagementSystem.Model.Student;
import ro.alexandru.studentManagementSystem.Repository.StudentRepository;
import ro.alexandru.studentManagementSystem.ServiceImpl.StudentServiceImpl;

import java.util.List;
@Service
public class StudentService implements StudentServiceImpl {

  private final  StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudent(Long id) {
       studentRepository.deleteById(id);
    }
}
