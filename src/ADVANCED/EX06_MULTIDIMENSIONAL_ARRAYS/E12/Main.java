package ADVANCED.EX06_MULTIDIMENSIONAL_ARRAYS.E12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        Matrix matrix = new Matrix(rows, cols);
        matrix.setMatrix(readMatrixInfo(scanner, rows));

        char fillColour = scanner.nextLine().charAt(0);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        Bucket bucket = new Bucket(row, col, matrix);
        bucket.paint(fillColour);

        System.out.println(matrix.toString());

    }

    public static List<String> readMatrixInfo(Scanner scanner, int linesCount) {
        List<String> lines = new ArrayList<>();
        while (linesCount-- > 0) {
            lines.add(scanner.nextLine().replaceAll("\\s+", ""));
        }
        return lines;
    }
}