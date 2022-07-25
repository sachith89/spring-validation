package com.sachith.demo.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@Builder
public class UserRequestDTO {

    @NotBlank(message = "Invalid Name : Cannot be empty")
    @NotNull(message = "Invalid name : Cannot be NULL")
    @Size(min = 3, max = 10, message = "Invalid Name : Must be between 3 to 10 characters")
    private String name;

    @Email(message = "Invalid Email")
    private String email;

    @NotBlank(message = "Invalid Phone number: Empty number")
    @NotNull(message = "Invalid Phone number: Number is NULL")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number")
    private String phone;

    private Date dateOfBirth;

    @Min(value = 1, message = "Invalid Age: Equals to zero or Less than zero")
    @Max(value = 100, message = "Invalid Age: Exceeds 100 years")
    private int age;
}
