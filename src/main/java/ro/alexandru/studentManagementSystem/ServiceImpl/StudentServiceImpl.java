package ro.alexandru.studentManagementSystem.ServiceImpl;

import ro.alexandru.studentManagementSystem.Model.Student;

import java.util.List;

public interface StudentServiceImpl {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
