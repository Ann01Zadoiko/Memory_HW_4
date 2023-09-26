package org.example;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Task {

    private static final Logger logger = Logger.getLogger(Task.class);

    public StringBuilder changeText(){
        String text = inputText();
        char [] chars = text.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (i%2 == 0){
                result.append(Character.toUpperCase(chars[i]));
            } else {
                result.append(Character.toLowerCase(chars[i]));
            }
        }
        return result;
    }

    private String inputText(){
        logger.info("\nEnter some text");

        Scanner scanner = new Scanner(System.in);
        String someText = scanner.nextLine();
        scanner.close();

        return someText;
    }
}
