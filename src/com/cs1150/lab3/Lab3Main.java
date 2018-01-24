package com.cs1150.lab3;

import com.cs1150.util.Point;
import com.cs1150.util.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Lab3Main {

    public static void printMat(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void flipMatRows(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            int[] tmp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = tmp;
        }
    }

    public static void flipCol(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            flipArray(data[i]);
        }
    }

    private static void flipArray(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    private static void pointTest(Point[] arr) {
        Point a = arr[0];
        Point b = arr[1];
        double d = a.distanceTo(b);
        for(int i = 0; i < arr.length / 2; i++) {
            for(int j = arr.length - 1; j >= arr.length / 2; j--) {
                if(i == j) continue;
                Point _a = arr[i];
                Point _b = arr[j];
                double _d = _a.distanceTo(_b);
                if(_d < d) {
                    a = _a;
                    b = _b;
                    d = _d;
                }
            }
        }
        System.out.println("Point a: " + a.toString());
        System.out.println("Point b: " + b.toString());
        System.out.println("Distance: " + String.format("%.3f", d));
    }

    public static void main(String[] args) {

        int[][] d = {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };

        printMat(d);
        flipMatRows(d);
        System.out.println();
        printMat(d);
        System.out.println();
        flipCol(d);
        printMat(d);
        System.out.println();

        char[] c = {'a', 'b', 'e', 'f'};

        int a = Utils.binarySearch(c, 'f');
        System.out.println("Search for f: " + a);

        a = Utils.binarySearch(c, 'c');
        System.out.println("Search for c: " + a);

        System.out.println();

        Point[] p = {
                new Point(-1, 3),
                new Point(3, 3),
                new Point(4, 2),
                new Point(1, 1),
                new Point(2, 0.5),
                new Point(4, -0.5),
                new Point(2, -1),
                new Point(-1, -1)
        };

        pointTest(p);

        System.out.println();


        String in;
        Stack<Integer> stack = new Stack<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        final int NUM_COUNT = 10;

        try {
            for(int i = 0; i < NUM_COUNT; i++) {
                in = reader.readLine();
                try {
                    int num = Integer.parseInt(in);

                    stack.push(num);

                } catch (NumberFormatException ne) {
                    System.err.println("Please enter a valid number");
                    i--;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int sum = 0;
        while(!stack.empty())
            sum += stack.pop();
        System.out.println("The sum of 10 numbers is: " + sum);

    }


}
