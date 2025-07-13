package com.Task1.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RollNo;
    @Column(name="student_name")
    private String Name;
    @Column
    private float Percentage;
    @Column
    private String Branch;

    public Student(){

    }

    public Student(float percentage, String name, String branch) {
        super();
        Percentage = percentage;
        Name = name;
        Branch = branch;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public float getPercentage() {
        return Percentage;
    }

    public void setPercentage(float percentage) {
        Percentage = percentage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
