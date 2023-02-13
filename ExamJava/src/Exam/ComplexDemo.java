/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam;

/**
 *
 * @author Administrator
 */
public class ComplexDemo {
  public static void main(String[] args) {
    Complex a1 = new Complex(7, 8);
    Complex a2 = new Complex
        (9, 10);
    
    System.out.println("Complex number 1: " + a1);
    System.out.println("Complex number 2: " + a2);
    
    Complex sum = a1.add(a2);
    System.out.println("Sum of complex numbers: " + sum);
    
    Complex difference = a1.subtract(a2);
    System.out.println("Difference of complex numbers: " + difference);
    
    Complex product = a1.multiply(a2);
    System.out.println("Product of complex numbers: " + product);
    
    Complex quotient = a1.divide(a2);
    System.out.println("Quotient of complex numbers: " + quotient);
    
    a1.setRealPart(11);
    a1.setImaginaryPart(22);
    System.out.println("Complex number 1 after modification: " + a1);
  }
}

