package com.dynatrace.hometask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Please, ask the question");
        String line = null;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (line == null) {
            line = buffer.readLine();
        }
        String answer = AnswerGenerator.giveAnswer(line);
        System.out.println(" >> " + answer);
    }
}
