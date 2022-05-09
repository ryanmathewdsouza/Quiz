import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        //        initialise variables in global scope
        String answer = "";
        int score = 0;

        Scanner in = new Scanner(System.in);

//        while answer is blank, keep asking for an answer
        while (answer.equals("")) {
            System.out.println("Which boxer has earned the most amount of money from the sport?");
            System.out.println("A: Muhammad Ali");
            System.out.println("B: Manny Pacquiao");
            System.out.println("C: Floyd Mayweather");
            System.out.println("D: Lennox Lewis");
            answer = in.nextLine().toUpperCase();
        }
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
        if (answer.equals("A")) {
            score++;
        }

        System.out.println("Congratualations on completing the quiz, you achieved a final score of " + score);

    }
}
