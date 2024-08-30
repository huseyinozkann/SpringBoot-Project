package com.huseyinozkan.springdemo.mvc;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message="is required")
    private String lastName = "";

    @NotNull(message="is required")
    @Min(value=0, message="must be greater than or equal to zero")
    @Max(value=10, message="must be less than or equal to 10")
    private int freePasses;


    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;


    public @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits") String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits") String postalCode) {
        this.postalCode = postalCode;
    }

    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10, message = "must be less than or equal to 10")
    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(@Min(value = 0, message = "must be greater than or equal to zero") @Max(value = 10, message = "must be less than or equal to 10") int freePasses) {
        this.freePasses = freePasses;
    }

    public @NotNull(message = "is required") @Size(min = 1, message = "is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
