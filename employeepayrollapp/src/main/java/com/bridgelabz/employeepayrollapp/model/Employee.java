package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String profileImage;
    private String gender;

    @ElementCollection
    private List<String> departments;

    private double salary;

    // Updated start date fields to use StartDateDTO structure
    private int startDay;
    private String startMonth;
    private int startYear;

    private String notes;

    // Constructor that converts EmployeeDTO to Employee model
    public Employee(EmployeeDTO employeeDTO) {
        this.name = employeeDTO.getName();
        this.profileImage = employeeDTO.getProfileImage();
        this.gender = employeeDTO.getGender();
        this.departments = employeeDTO.getDepartments();
        this.salary = employeeDTO.getSalary();
        this.startDay = employeeDTO.getStartDate().getDay(); // Ensure this matches your StartDateDTO structure
        this.startMonth = employeeDTO.getStartDate().getMonth();
        this.startYear = employeeDTO.getStartDate().getYear();
        this.notes = employeeDTO.getNotes();
    }
}
