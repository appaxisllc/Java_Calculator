package com.tts;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //add method
        public int add ( int num1, int num2)
        {

            return num1 + num2;
        }
        //subtract method
        public int subtract ( int num1, int num2)
        {
            return num1 - num2;

        }
        //multiply method
        public int multiply ( int num1, int num2)
        {
            return num1 * num2;
        }
        //divide method
        public int divide ( int num1, int num2)
        {

            if (num2 == 0) {
                System.out.println("num2 cannot be zero");
                return 0;
            } else
                return num1 / num2;
        }

        //square method
        public int square ( int num1)
        {
            return num1 * num1;
        }
    }
}

