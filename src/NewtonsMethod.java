package cisy105.cmaandal;

import java.util.Scanner;

/**
 *
 * @author g00265399 Cyril Maandal
 */
/**
 *
 * @Description This program demonstrates Newton's method. (Only works with
 * polynomials)
 */
public class NewtonsMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Term[] expressions;
        Term[] derivatives;
        double initialGuess;
        int iterations;
        System.out.println("cx^(exponent)+b");
        System.out.println("How many terms are in the function?");
        expressions = new Term[scan.nextInt()];
        scan.nextLine();
        for (int i = 0; i < expressions.length; i++) {
            expressions[i] = new Term(0,0,0);
            System.out.println("Enter the constant");
            expressions[i].setC(scan.nextDouble());
            System.out.println("Enter the exponent");
            expressions[i].setExponent(scan.nextDouble());
            System.out.println("Enter b");
            expressions[i].setB(scan.nextDouble());
        }
        System.out.println("How many terms are in the derivative");
        derivatives = new Term[scan.nextInt()];
        for (int k = 0; k < derivatives.length; k++) {
            derivatives[k] = new Term(0,0,0);//initializes the object
            System.out.println("Enter the constant");
            derivatives[k].setC(scan.nextDouble());
            System.out.println("Enter the exponent");
            derivatives[k].setExponent(scan.nextDouble());
            System.out.println("Enter b");
            derivatives[k].setB(scan.nextDouble());
        }
        System.out.println("Enter the first guess");
        initialGuess = scan.nextDouble();
        System.out.println("Enter how many iterations");
        iterations = scan.nextInt();
        newtonsMethod(expressions,derivatives,initialGuess,iterations);
    }
    public static void newtonsMethod(Term[] f, Term[] d, double n,int iterations) {
        double x = n;
        double x2;
        Term e1 = new Term(f);
        Term e2 = new Term(d);
        for (int i = 0; i < iterations; i++) {
            x2 = x - (e1.solveAll(f, x) / e2.solveAll(d, x));//newtons computation
            System.out.println("x["+(i+1)+"]: "+x2);
            x = x2;
        }
    }
}
