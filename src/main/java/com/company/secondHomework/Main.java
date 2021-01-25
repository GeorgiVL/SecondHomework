package com.company.secondHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sentence = "My name is JavaScript.";

        Scanner scanner = new Scanner(System.in);
        String programingL = scanner.nextLine();

       // String newWord = programingL;
        String modifiedString = sentence.replace("JavaScript", programingL);
        System.out.println(modifiedString);
    }
}
