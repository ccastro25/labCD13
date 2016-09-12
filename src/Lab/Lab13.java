package Lab;

import java.util.Scanner;

/**
 * Created by castro on 9/9/16.
 */
public class Lab13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 5;

        int usersGuess;

        int count=1;

        int previousGuess = 0;

       do {

            System.out.println("Guess the secret number, which is between 1-10");
            usersGuess= scanner.nextInt();

            if ( usersGuess ==5 ){System.out.println(usersGuess + " is the correct number and it took "+ count+" times to guess it "); break;}

            else if (usersGuess<5){System.out.println("Your guess is to low, try again");
            previousGuess = usersGuess;}

            else if(usersGuess>5){System.out.println("Your guess is to high , try again");previousGuess = usersGuess;}

            if(usersGuess != previousGuess)
            {count++;}

        }while(usersGuess !=5);

    }






}


