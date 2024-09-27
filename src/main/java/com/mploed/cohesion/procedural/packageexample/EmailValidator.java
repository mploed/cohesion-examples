package com.mploed.cohesion.procedural.packageexample;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@(.+)$"
    );

    public static boolean emailValid(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
