package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
 FeatureMultiply
        multiply();
    }

    public static void multiply(){

FeatureDelete
        delete();
        add();

    }
    public static void delete(){

    }
    public static void add(){
 master
        System.out.println("please enter your first number :");
        Scanner inputs = new Scanner(System.in);                  //scans users input
        int FirstNumber = inputs.nextInt();

        System.out.println("please enter your second number :");
        int SecondNumber = inputs.nextInt();
 FeatureMultiply

        int total = FirstNumber * SecondNumber;
        System.out.println("The total is " + total);
    }
}

 master

        int total = FirstNumber + SecondNumber;
        System.out.println("The total is " + total);
    }
        public static void delete(){
            System.out.println("please enter your first number :");
            Scanner inputs = new Scanner(System.in);                  //scans users input
            int FirstNumber = inputs.nextInt();

            System.out.println("please enter your second number :");
            int SecondNumber = inputs.nextInt();

            int total = FirstNumber - SecondNumber;
            System.out.println("The total is " + total);
        }
    }
 master

