package ru.itsjava.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StudentsJdbcImpl implements StudentsJdbc{


    @Override
    public int countStudentByFio(String fio) {
        return 0;
    }
}
