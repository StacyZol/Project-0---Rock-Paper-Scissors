package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static List<String> outcomes = new ArrayList<>();
    public static List<String> playerWins = new ArrayList<>();
    public static List<String> computerWins = new ArrayList<>();

    public static List<String> tieOutcomes = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("\nWelcome to Rock, Paper, Scissors");
        mainMenu ();
    }

    public static void mainMenu (){
        System.out.println("\nMAIN MENU");
        System.out.println(".............................");
        System.out.println("Type 'play' to start the game.");
        System.out.println("Type 'history' to view the history of your game.");
        System.out.println("Type 'leave' to end the game.");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase().trim();

        if (userInput.equals("play")){
            playMethod();

        }

        else if (userInput.equals("history")){
            historyMethod();
            //statisticsMethod();
          //  statisticsMethod2();
            //statisticsMethod3();
        }

        else if (userInput.equals("leave")){
            leaveMethod();
        }

        else {
            System.out.println("\nSorry, not an option. Please try again!\n");
            mainMenu ();
        }
    }

    public static void playMethod () {
        System.out.println("\nPrint 'rock' 'paper' or 'scissors'");
        Scanner input = new Scanner(System.in);
        String userInput2 = input.nextLine();
        userInput2 = userInput2.toLowerCase().trim();
        if (userInput2.equals("rock")){
            rockMethod();
        }
        else if (userInput2.equals("paper")){
            paperMethod();
        }
        else if (userInput2.equals("scissors")){
            scissorsMethod();
        }
        else {
            System.out.println("\nSorry, that's not an option. Try again!");
            playMethod () ;
        }
    }



    public static void rockMethod() {
        System.out.println("\nUser picks: Rock");
        Random rand = new Random();
        int value = rand.nextInt(3) + 1;
        //System.out.println(value);

        switch (value) {
            case 1:
                System.out.println("Computer picks: Rock");
                System.out.println("\nIt's a tie!");
                break;
            case 2:
                System.out.println("Computer picks: Paper");
                System.out.println("\nComputer Wins!");
                break;
            case 3:
                System.out.println("Computer picks: Scissors");
                System.out.println("\nYou win!");
                break;
        }
        if (value==3) {
            outcomes.add("WIN: You - Rock; Computer - Scissors");
            playerWins.add("P");
        }
        else if (value==2) {
            outcomes.add("LOSS: You - Rock; Computer - Paper");
            computerWins.add ("C");
        }
        else if (value==1) {
            outcomes.add("TIE: You - Rock; Computer - Rock");
            tieOutcomes.add("T");
        }

        mainMenu();

    }
    public static void paperMethod() {
        System.out.println("\nUser picks: Paper");
        Random rand = new Random();
        int value = rand.nextInt(3) + 1;
        //System.out.println(value);

        switch (value) {
            case 1:
                System.out.println("Computer picks: Rock");
                System.out.println("\nYou win!");
                break;
            case 2:
                System.out.println("Computer picks: Paper");
                System.out.println("\nIt's a tie!");
                break;
            case 3:
                System.out.println("Computer picks: Scissors");
                System.out.println("\nComputer Wins!");
                break;
        }
       if (value==3) {
           outcomes.add ("LOSS: You - Paper; Computer - Scissors");
           computerWins.add ("C");
       }
        else if (value==2) {
            outcomes.add ( "TIE: You - Paper; Computer - Paper");
           tieOutcomes.add ("T");
        }
        else if (value == 1) {
            outcomes.add ("WIN: You - Paper; Computer - Rock");
           playerWins.add("P");
        }
        mainMenu();
    }
    public static void scissorsMethod() {
        System.out.println("\nUser picks: Scissors");
        Random rand = new Random();
        int value = rand.nextInt(3) + 1;
        //System.out.println(value);
        switch (value){
        case 1:
        System.out.println("Computer picks: Rock");
        System.out.println("\nComputer Wins!");
        break;
        case 2:
        System.out.println("Computer picks: Paper");
        System.out.println("\nYou win!");
        break;
        case 3:
        System.out.println("Computer picks: Scissors");
        System.out.println("\nIt's a tie!");
        break;
    }
        if (value==3) {
            outcomes.add("TIE: You - Scissors; Computer - Scissors");
            tieOutcomes.add("T");
        }
        else if (value==2) {
            outcomes.add("WIN: You - Scissors; Computer - Paper");
            playerWins.add("P");
        }
        else if (value==1) {
            outcomes.add("LOSS: You - Scissors; Computer - Rock");
            computerWins.add("C");
        }
        mainMenu();
    }
    public static void historyMethod () {
        System.out.println("\nGAME HISTORY");
        System.out.println(".............................");
        int max = 0;
        for (int i = 0; i < outcomes.size(); i++) {
            System.out.println(outcomes.get(i));
        }
   // }
   // public static void statisticsMethod() {
      //  int max = 0;
    //    for (int i = 0; i < playerWins.size(); i++) {
            System.out.println("\nGames Player Won: " + playerWins.size());
       // }
    //}
    //public static void statisticsMethod2() {
     //   for (int i = 0; i < computerWins.size(); i++) {
            System.out.println("\nGames Computer Won: " + computerWins.size());
      //  }
    //}
    //public static void statisticsMethod3 () {
        //for (int i=0; i< tieOutcomes.size(); i++) {
            System.out.println("\nTie Games: " + tieOutcomes.size());
       // }
        mainMenu();
    }
    public static void leaveMethod() {
        System.out.println("\nAre you sure you want to leave?");
        System.out.println("'Yes' or 'No'");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        userInput = userInput.toLowerCase().trim();

        if ((userInput.equals("yes")) || (userInput.equals("y"))){
            System.out.println("\nBye!");
            System.exit(0);

        }
        else if ((userInput.equals("no")) || (userInput.equals("n"))) {
            System.out.println("\nWoohoo! Keep playing!");
            mainMenu();
        }
        else {
            System.out.println("\nSorry, what did you mean?");
            leaveMethod();
        }
    }




}
