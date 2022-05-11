import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class quiz {
    public static void main(String[] args) {
//        initialise variables in global scope
        String answer = "";
        Integer score = 0;

        Scanner in = new Scanner(System.in);

//        introduction and ask for a username
        System.out.println("Hello there, please enter the username you would like to play under");
        String username = in.nextLine();

//        try to find the previous score
        try {
            File f = new File("score.txt");
            Scanner myReader = new Scanner(f);
//        if previous score is found, display it
            while (myReader.hasNextLine()) {
                String lastName = myReader.nextLine();
                String lastScore = myReader.nextLine();
                System.out.println("The previous player had a username of " + lastName + " and a score of " + lastScore);
            }
            myReader.close();
//        otherwise, display that no previous score has been found
        } catch (FileNotFoundException e) {
            System.out.println("No previously saved score was found.");
        }

//        display an introductory statement
        System.out.println("Okay " + username + ", here's the first question of the quiz:");

//        while answer is blank, keep asking for an answer
        while (answer.equals("")) {
            System.out.println("Which boxer has earned the most amount of money from the sport?");
            System.out.println("A: Muhammad Ali");
            System.out.println("B: Manny Pacquiao");
            System.out.println("C: Floyd Mayweather");
            System.out.println("D: Lennox Lewis");
            answer = in.nextLine().toUpperCase();
        }
//        increment score, if answer is correct
        if (answer.equals("C")) {
            score++;
        }

//        while answer is blank, keep asking for an answer
        answer = "";
        while (answer.equals("")) {
            System.out.println("Which of these boxers won an olympic gold medal?");
            System.out.println("A: Mike Tyson");
            System.out.println("B: Luke Campbell");
            System.out.println("C: Canelo Alvarez");
            System.out.println("D: Robero Duran");
            answer = in.nextLine().toUpperCase();
        }
//        increment score, if answer is correct
        if (answer.equals("B")) {
            score++;
        }

//        while answer is blank, keep asking for an answer
        answer="";
        while (answer.equals("")) {
            System.out.println("Which of these boxers was/is a heavyweight?");
            System.out.println("A: Tyson Fury");
            System.out.println("B: Guillermo Rigondeaux");
            System.out.println("C: Tommy Hearns");
            System.out.println("D: Willie Pep");
            answer = in.nextLine().toUpperCase();
        }
//        increment score, if answer is correct
        if (answer.equals("A")) {
            score++;
        }

//        display end of quiz message, with the score achieved
        System.out.println("Congratulations on completing the quiz " + username + ", you achieved a final score of " + score);

        try {
            FileWriter myWriter = new FileWriter("score.txt");
            myWriter.write(username);
            myWriter.write(System.getProperty("line.separator"));
            myWriter.write(score.toString());
//        following line is very important
            myWriter.close();
            System.out.println("Your score has been successfully saved.");
        } catch (IOException e) {
            System.out.println("An error occurred when attempting to save your score.");
            e.printStackTrace();
        }
    }
}
