package com.github.mjkuranda.retrographicsmanager;

public class Utils {

    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }

        return str.matches("^-?\\d+$");
    }
}
