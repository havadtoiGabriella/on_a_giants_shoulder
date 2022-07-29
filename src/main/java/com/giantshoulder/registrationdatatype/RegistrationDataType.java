package com.giantshoulder.registrationdatatype;

public enum RegistrationDataType {
    USER("My Name", "onagiantsshoulder@gmail.com", "Watch Yesterday's Broadcast Now");

    private final String name;
    private final String email;
    private final String date;

    RegistrationDataType(String name, String email, String date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }
}
