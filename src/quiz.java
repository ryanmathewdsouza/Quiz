import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        //        initialise variables in global scope
        String answer = "";
        int score = 0;

        Scanner in = new Scanner(System.in);

//        while username is blank, keep asking for a username
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

        System.out.println("Congratualations on completing the quiz, you achieved a final score of " + score);

    }
}
