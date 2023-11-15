package ie.atu.springbootvalidation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    @Size(min = 2, max = 50, message = "Title must be between 2 and 50 characters")
    private String title;

    @NotBlank(message = "Employee ID cannot be blank")
    private String employeeId;

    @Email(message = "Invalid email address")
    private String email;

    @Min(value = 0, message = "Age must be greater than or equal to 0")
    private int age;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;
}
