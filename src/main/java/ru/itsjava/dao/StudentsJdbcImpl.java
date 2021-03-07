package ru.itsjava.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import ru.itsjava.domain.Student;

@Repository
@RequiredArgsConstructor
public class StudentsJdbcImpl implements StudentsJdbc{
private final JdbcOperations jdbcOperations;

    @Override
    public int countStudentByFio(String fio) {
        return jdbcOperations.queryForObject("select count(*) from students where fio = '" + fio + "'", Integer.class);
    }

//    @Override
//    public void insertStudent(Student student) {
//        jdbcOperations.update("insert into students(id, fio, age) values (?,?,?)", student.getId(), student.getFio(),student.getAge());
//    }
}
