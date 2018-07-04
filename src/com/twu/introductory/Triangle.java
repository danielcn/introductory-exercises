package com.twu.introductory;

public class Triangle {

    public String printOneAsterisk() {
        return "*";
    }

    public String drawHorizontalLine(int sizeLine) {
        String line = new String();
        for (int i = 0; i < sizeLine; i++) {
            line += "*";
        }
        return line;
    }
}
