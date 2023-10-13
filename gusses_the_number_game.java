
package com.company;
import java.util.Random;
import java.util.Scanner;

 class game {
    public int number;
    public int usernumber;
    public int numberofGusses =0;


    // created gatter and setter of numberofgusses
    public int getNumberofGusses() {

        return numberofGusses;
    }

    public void setNumberofGusses(int numberofGusses) {

        this.numberofGusses = numberofGusses;
    }

     game() {
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }

    void takeuserinput() {
        System.out.println("Guess the number ");
        Scanner sc = new Scanner(System.in);
        usernumber = sc.nextInt();
    }

    boolean iscorrectnumber() {
        numberofGusses++;
        if (usernumber == number)
        {
            System.out.format("the number you guess is right it was %d\n you guess " + " it in %d attempts ", number, numberofGusses);
            return true;
        }

        else if (usernumber < number) {
            System.out.println("number is less....");
        }

        else if (usernumber > number) {
            System.out.println("number is large....");
        }
          return false;
    }
}
public class gusses_the_number_game {
    public static void main(String[] args) {

       game g = new game();
        boolean b =false;
        while(!b){
            g.takeuserinput();
            b = g.iscorrectnumber();
        }

    }
}
