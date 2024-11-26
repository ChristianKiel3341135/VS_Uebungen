package entity;

import jakarta.xml.bind.annotation.*;

import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlAttribute
    private int studentNumber;

    private String firstName;
    private String lastName;
    private Adresse anschrift;

    // Default-Konstruktor zwingend notwendig
    public Student() {}

    public Student(String firstName, String lastName, Adresse anschrift) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.anschrift = anschrift;
    }

    public Student(int studentNumber, String firstName, String lastName, Adresse anschrift) {
        this(firstName, lastName, anschrift);
        this.studentNumber = studentNumber;
    }


    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Adresse getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNumber == student.studentNumber;
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentNumber);
    }
}
