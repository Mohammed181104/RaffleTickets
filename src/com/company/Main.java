package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static String[][] information = new String[10][2];
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            System.out.println("DO YOU  WANT TO BUY OR CHECK A RAFFLE TICKET:");
            String answer = bufferReader();
            if (answer.equalsIgnoreCase("buy")) {
                System.out.println("What is your name:");
                information[i][0] = bufferReader();
                i++;
            }else if(answer.equalsIgnoreCase("check")){
                Random random= new Random();
                System.out.println("What is your name?");
                
            }
            System.out.println(Arrays.deepToString(information));
        }

    }

    private static String bufferReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = " ";
        try {
            answer = reader.readLine();
        }catch(Exception e){
            System.out.println(e);
        }
        return answer;
    }
}
