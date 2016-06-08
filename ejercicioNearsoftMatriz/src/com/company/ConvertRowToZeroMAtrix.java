package com.company;

import java.util.Scanner;

public class ConvertRowToZeroMAtrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type numbers of columns .-");
        int columns = scanner.nextInt();
        System.out.print("Type numbers of rows.-");
        int rows = scanner.nextInt();

        int[][] matrix = fillMatrix(columns, rows);
        printFullMatrix(matrix);
        System.out.println("");
        System.out.println("*********************************");
        System.out.println("");
        fillTheRowWithZeroIfaZeroIsFound(matrix);
    }

    private static void fillTheRowWithZeroIfaZeroIsFound(int[][] matrix) {
        boolean zeroFound = false;
        int columns = matrix[0].length;
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < columns; y++) {
                if (matrix[x][y] == 0 && !zeroFound) {
                    System.out.println("position of zero " + (x + 1) + "," + (y + 1));
                    zeroFound = true;
                    y = 0;
                }
                if (zeroFound) {
                    matrix[x][y] = 0;
                }
            }
            zeroFound = false;
        }
        printFullMatrix(matrix);
    }

    private static void printFullMatrix(int[][] matrix) {
        int columns = matrix[0].length;
        for (int x = 0; x < matrix.length; x++) {
            String rowToPrint;
            rowToPrint = "[";
            for (int y = 0; y < columns; y++) {
                rowToPrint = rowToPrint + "" + matrix[x][y];
                rowToPrint = rowToPrint + "-----";
            }
            rowToPrint = rowToPrint + "]";
            System.out.println(rowToPrint);
        }
    }

    private static int[][] fillMatrix(int columns, int rows) {
        int[][] matrix = new int[rows][columns];

        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < columns; y++) {
                matrix[x][y] = (int) (Math.random() * 10.0);
            }
        }
        return matrix;
    }

}
