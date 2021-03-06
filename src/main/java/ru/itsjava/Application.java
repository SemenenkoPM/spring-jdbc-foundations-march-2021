package ru.itsjava;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.services.StudentService;

import java.sql.SQLException;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws SQLException {
        var context = SpringApplication.run(Application.class);

        StudentService studentService = context.getBean(StudentService.class);
        System.out.println("Количество студентов " + studentService.countStudentByFio("Петров АА"));

        Console.main();
    }
}
