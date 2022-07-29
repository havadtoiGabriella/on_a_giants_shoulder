package com.giantshoulder.pagetype;

public enum RegistrationDataType {
    NAME("My Name"),
    EMAIL("onagiantsshoulder@gmail.com");

    private final String data;

    RegistrationDataType(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

