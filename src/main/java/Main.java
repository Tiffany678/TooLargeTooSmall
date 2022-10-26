/**
 * Created by Yingjie Yang on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){
        // declare an variables to store user's number
        int guessNum;

        Scanner in = new Scanner(System.in);

        // prompt user for an interge input
        System.out.print("I'm thinking of a number between 1 and 10 (including both). Can you guess what it is?");
        System.out.print("\nType a number: ");

        //using nextInt to read input
        guessNum = in.nextInt();

        //generate a random number
        Random random = new Random();
        int number = random.nextInt(10)+1;

        if(number==guessNum){
            System.out.print("My number is "+ number +". You have correct guess.");
        }else if(number>guessNum){
            System.out.print("My number is "+ number +". Your guess is Too small.");
        }else{
            System.out.print("My number is "+ number +". Your guess is too large.");
        }
    }
}
