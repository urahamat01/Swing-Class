/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Student- J2EE
 */
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "student_name", nullable = false)
    private String name;
    private String gender;
    private String round;
    private Date courseStatDate;
    private boolean courseStats;
    private String courseComple;
    private String note;

    public Student() {
    }

    public Student(int id, String name, String gender, String round, Date courseStatDate, boolean courseStats, String courseComple, String note) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.round = round;
        this.courseStatDate = courseStatDate;
        this.courseStats = courseStats;
        this.courseComple = courseComple;
        this.note = note;
    }

    public Student(String name, String gender, String round, Date courseStatDate, boolean courseStats, String courseComple, String note) {
        this.name = name;
        this.gender = gender;
        this.round = round;
        this.courseStatDate = courseStatDate;
        this.courseStats = courseStats;
        this.courseComple = courseComple;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public Date getCourseStatDate() {
        return courseStatDate;
    }

    public void setCourseStatDate(Date courseStatDate) {
        this.courseStatDate = courseStatDate;
    }

    public boolean isCourseStats() {
        return courseStats;
    }

    public void setCourseStats(boolean courseStats) {
        this.courseStats = courseStats;
    }

    public String getCourseComple() {
        return courseComple;
    }

    public void setCourseComple(String courseComple) {
        this.courseComple = courseComple;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", round=" + round + ", courseStatDate=" + courseStatDate + ", courseStats=" + courseStats + ", courseComple=" + courseComple + ", note=" + note + '}';
    }

}
