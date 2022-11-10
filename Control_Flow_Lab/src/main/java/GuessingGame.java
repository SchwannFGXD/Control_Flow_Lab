import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Choose a minimum number");
        //min
        Scanner reader = new Scanner(System.in);
        String min = reader.nextLine();
        int min2 = Integer.parseInt(min);

        System.out.println("Choose a maximum number");
        //max
        String max = reader.nextLine();
        int max2 = Integer.parseInt(max);

        /*math.random generates number between 0 and 1.
        using expression below, random number between min and max is obtained.
         */
        int random = (int) Math.floor(Math.random()*(max2-min2+1)+min2);

        System.out.println("A random number between " + min2 + " and " + max2 + " has been chosen.");

        System.out.println("How many guesses would you like?");
        //number of guesses
        String noGuess = reader.nextLine();
        int n = (Integer.parseInt(noGuess))+1;

        for (int i = 1; i<n; i++){

            if((n-i)==1){
                System.out.println("You have " +(n-i)+ " attempt left to guess the number!");
            }
            else {
                System.out.println("You have " + (n - i) + " attempts left to guess the number!");
            }

            //store guess
            String guess = reader.nextLine();
            int guess2 = Integer.parseInt(guess);

            //guess correctly
            if(guess2 == random) {

                if (i == 1) {
                    System.out.println("Congrats, it took you " + i + " attempt to guess correctly!");
                }
                else {
                    System.out.println("Congrats, it took you " + i + " attempts to guess correctly!");
                }
                i=(n+1);
            }
            //guess too low
            else if(guess2 < random){
                System.out.println("You guessed too low!");
                if((n-i)==1){
                    System.out.println("Game over!");
                }
            }
            //guess too high
            else {
                System.out.println("You guessed too high!");
                if((n-i)==1){
                    System.out.println("Game over!");
                }
            }
        }
    }
}
