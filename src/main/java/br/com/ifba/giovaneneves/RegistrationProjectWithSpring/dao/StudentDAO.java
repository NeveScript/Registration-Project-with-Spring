package br.com.ifba.giovaneneves.RegistrationProjectWithSpring.dao;

import br.com.ifba.giovaneneves.RegistrationProjectWithSpring.model.Student;

import java.util.List;

public abstract class StudentDAO extends GenereicDAO{

    //============================================{ METHODS }============================================//
    /**
     * List all students.
     * @return a list with all students in the database.
     */
    public abstract List<Student> listStudents();

}
