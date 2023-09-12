package org.upgrad.coursework.course_2.module_2;

import java.util.*;

class Number {
    //Write your code here
    private double real;
    private double imaginary;
    public double getImaginaryPart() {
        return imaginary;
    }

    public double getRealPart() {
        return real;
    }

    public void setImaginaryPart(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setRealPart(double real) {
        this.real = real;
    }

    public String getNumber(){
        if(this.real != 0 ){
            return this.real + "+i"+ this.imaginary;
        }else if (this.real == 0 && this.imaginary == 0) {
            return this.real+"+i"+this.imaginary;
        } else {
            return "i"+this.imaginary;
        }
    }
}

class Complex extends Number {
    //Write your code here
    public boolean isNumberComplex() {
        return (super.getImaginaryPart() != 0);
    }

    public void checkComplex() {
        if(isNumberComplex()){
            System.out.println("The given number is complex");
        }else {
            System.out.println("The given number is real");
        }
    }
}

class PurelyImaginary extends Complex {
    //Write your code here
    public PurelyImaginary(double real, double imaginary){
        super.setRealPart(real);
        super.setImaginaryPart(imaginary);
    }

    public void checkPurelyImaginaryNumber(){
        if(super.isNumberComplex() && super.getRealPart() == 0){
            System.out.println("The number is purely imaginary");
            return;
        }
        if(super.getRealPart() >=0){
            System.out.println("The number is not purely imaginary");
            return;
        }
    }
}

public class ComplexNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());

        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        System.out.println(num.getNumber());
        num.checkPurelyImaginaryNumber();

    }
}

