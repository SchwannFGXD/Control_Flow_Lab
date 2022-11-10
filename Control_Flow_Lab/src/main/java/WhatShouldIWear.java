import java.util.Scanner;

public class WhatShouldIWear {
    public static void main(String[] args) {

        //possible weathers
        String[] possibleWeathers = {"sunny","rainy","snowy","cloudy"};
        Scanner reader = new Scanner(System.in);
        boolean correctWeather = false;
        String weatherDFinal = "";

        while(correctWeather == false){

            System.out.println("How is the weather today?");
            //weather description
            String weatherD = reader.nextLine();

            //check if described weather is recognisable
            for(String i: possibleWeathers){
                if(weatherD.equals(i)){
                    correctWeather =true;
                    weatherDFinal = weatherD;
                }
            }


            if(correctWeather == false){
                System.out.println("I dont understand, try again!");
            }

        }

        System.out.println("What is the average temperature today?");
        //weather description
        String tempD = reader.nextLine();
        int tempD2 = Integer.parseInt(tempD);

        int tempN = 0;

        if(tempD2<= 13){
            System.out.println("It's cold outside");
            tempN = 1;
        }
        else if( (tempD2>13) && (tempD2<=17) ){
            System.out.println("It's cool outside");
            tempN = 2;
        }
        else if( (tempD2>17) && (tempD2<=25) ){
            System.out.println("It's warm outside");
            tempN = 3;
        }
        else if(tempD2>25){
            System.out.println("It's hot outside");
            tempN = 4;
        }

        String itemA ="";
        String itemB ="";

        if(weatherDFinal.equals("snowy")){
            itemA ="fluffy";
        }
        if(weatherDFinal.equals("rainy")){
            itemA ="waterproof";
        }

        if(tempN==1) {
            System.out.println("You Should wear a " + itemA + " coat and boots!");
        }

        if(tempN==2) {
            System.out.println("You Should wear a " + itemA + " jacket and normal shoes!");
        }

        if(tempN==3) {
            System.out.println("You Should wear a " + itemA + " shirt and normal shoes!");
        }

        if(tempN==1) {
            System.out.println("You Should wear a " + itemA + " shirt and sandals!");
        }


    }
}
