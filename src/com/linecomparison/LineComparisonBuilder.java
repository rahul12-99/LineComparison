package com.linecomparison;

import java.util.Scanner;

public class LineComparisonBuilder {
    // Calculate length and return
    public int lengthCalculate(int x1, int y1, int x2, int y2) {
        int length = (int) Math.pow((x2 - x1), 2) + (int) Math.pow((y2 - y1), 2);
        return (int) Math.sqrt(length);
    }

    // Check Equality and display
    public void checkEqual(Integer line1, Integer line2) {
        if (line1.equals(line2) == true) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }
    }

    public void checkComparison(Integer line1, Integer line2) {       // Check quality and display
        if (line1.compareTo(line2) > 0) {
            System.out.println("Line 1 is greater");
        } else if (line1.compareTo(line2) < 0) {
            System.out.println("Line 2 is greater");
        } else {
            System.out.println("Both the lines are equal");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program ");
        Scanner input = new Scanner(System.in);
        LineComparisonBuilder length = new LineComparisonBuilder();
        // coordinate of First Line
        int x1, y1, x2, y2;
        // Coordinate of Second Line
        int x3, y3, x4, y4;
        System.out.println("Please enter first coordinates x1 and y1 Of First Line: ");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println("Please enter second coordinates x2 and y2 Of First Line: ");
        x2 = input.nextInt();
        y2 = input.nextInt();
        System.out.println("Please enter first coordinates x3 and y3 Of Second Line: ");
        x3 = input.nextInt();
        y3 = input.nextInt();
        System.out.println("Please enter second coordinates x4 and y4 Of Second Line: ");
        x4 = input.nextInt();
        y4 = input.nextInt();
        Integer line1 = length.lengthCalculate(x1, y1, x2, y2);
        Integer line2 = length.lengthCalculate(x3, y3, x4, y4);
        System.out.println("Line1: " + length.lengthCalculate(x1, y1, x2, y2));
        System.out.println("Line2: " + length.lengthCalculate(x3, y3, x4, y4));
        length.checkEqual(line1, line2);
        length.checkComparison(line1, line2);
    }
}

