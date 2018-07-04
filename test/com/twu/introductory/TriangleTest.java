package com.twu.introductory;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void testPrintOneAsterisk(){
        Triangle triangle = new Triangle();
        assertEquals("*", triangle.printOneAsterisk());
    }

    @Test
    public void testDrawHorizontalLine(){
        Triangle triangle = new Triangle();
        int sizeLine = 8;
        assertEquals("********", triangle.drawHorizontalLine(sizeLine));
    }

    @Test
    public void testDrawVerticalLine(){
        Triangle triangle = new Triangle();
        int sizeLine = 3;
        String expectedVerticalLine = "*\n*\n*\n";
        assertEquals(expectedVerticalLine, triangle.drawVerticalLine(sizeLine));
    }

    @Test
    public void testDrawTriangle(){
        Triangle triangle = new Triangle();
        int sizeTriangle = 3;
        String expectedTriangle = "*\n**\n***\n";
        assertEquals(expectedTriangle, triangle.drawTriangle(sizeTriangle));
    }
}