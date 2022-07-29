package com.giantshoulder.registrationdatatype;

public enum RegistrationDataType {
    USER("My Name", "onagiantsshoulder@gmail.com");

    private final String name;
    private final String email;

    RegistrationDataType(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
