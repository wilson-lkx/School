package my.com.wilson.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Students")
public class Student implements Serializable {

    @Id
    @Column(name = "StudentID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentID;

    @Column(name = "FirstName", nullable = false)
    private String firstName;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "City", nullable = false)
    private String city;

    @Column(name = "DateOfBirth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "IntakeYear", nullable = false)
    private Integer intakeYear;

    @Column(name = "Hp", nullable = true)
    private String hp;

    @Column(name = "Gender", nullable = true)
    private Character gender;

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getIntakeYear() {
        return intakeYear;
    }

    public void setIntakeYear(Integer intakeYear) {
        this.intakeYear = intakeYear;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
}
