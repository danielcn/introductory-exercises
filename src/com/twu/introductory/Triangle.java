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

    public String drawVerticalLine(int sizeLine) {
        String verticalLine = new String();
        for (int i = 0; i < sizeLine; i++) {
            verticalLine += "*\n";
        }
        return verticalLine;
    }

    public String drawTriangle(int sizeTriangle) {
        String triangle = "";

        for (int i = 1; i <= sizeTriangle; i++) {
            triangle += reapeatChar("*", i) + "\n";
        }
        return triangle;
    }

    private String reapeatChar(String s, int size) {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < size; i++) {
            r.append(s);
        }
        return r.toString();
    }
}
