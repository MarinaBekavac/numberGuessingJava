package main.java;

import java.util.Random;

public class Functions {

    private static int guessedNumber;
    public static int MIN=0;
    public static int MAX=100;


    public static int getRandom(int min, int max){

        return (int) ((Math.random()*(max-min)+min));

    }



}
