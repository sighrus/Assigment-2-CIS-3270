package Chapter9;

import java.util.Scanner;

public class LinearEquationClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 6 values for a, b, c, d, e, f respectively: ");
        LinearEquation l = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        System.out.println("Values for a, b, c, d, e, f respectively are: " + l.getA() + ", " + l.getB() + ", " + l.getC() + ", " + l.getD() + ", " + l.getE() + ", " + l.getF());

        if (l.isSolvable()) {
            System.out.println("X and Y respectively are: " + l.getX() + " and " + l.getY());
        } else {
            System.out.println("The equation as no solution.");
        }
    }
}
