package org.example.springnewbie.ReqDTO;

import jakarta.validation.constraints.NotNull;
import org.apache.commons.validator.routines.EmailValidator;

public class FixUserDTO {
    private String new_name;
    private String new_email;
    @NotNull(message = "Invalid password: password is NULL")
    private String password;

    public String getName() { return new_name; }
    public String getEmail() { return new_email; }
    public String getPassword() { return password; }

    public boolean isEmailValid(){
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(new_email);
    }

    public boolean isEmpty(){
        return (password == null);
    }
}
