package ie.atu;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        delete();

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

