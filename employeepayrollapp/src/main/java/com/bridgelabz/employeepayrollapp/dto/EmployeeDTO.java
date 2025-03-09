package com.bridgelabz.employeepayrollapp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    @NotEmpty(message = "Name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z ]{2,}$", message = "Name must start with a capital letter and have at least 3 characters")
    private String name;

    @NotEmpty(message = "Profile Image must be selected")
    private String profileImage;

    @NotEmpty(message = "Gender cannot be empty")
    private String gender;

    @NotEmpty(message = "At least one department must be selected")
    private List<String> departments;

    private double salary;

    private StartDateDTO startDate;

    private String notes;
}
