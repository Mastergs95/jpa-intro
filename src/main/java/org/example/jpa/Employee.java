package org.example.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String job;
    private Double salary;

    public Employee(){
    }

    public Employee(String firstName, String lastName, String job, Double salary){

        this.firstName=firstName;
        this.lastName=lastName;
        this.job=job;
        this.salary=salary;
    }

    @Id
    @GeneratedValue
    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
