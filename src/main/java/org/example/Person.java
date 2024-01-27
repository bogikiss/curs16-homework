package org.example;

import lombok.Builder;

@Builder
public record Person (
     String firstName,
     String lastName,
     Integer age,
     String city
) {
    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }

    @Override
    public Integer age() {
        return age;
    }

    @Override
    public String city() {
        return city;
    }
}
