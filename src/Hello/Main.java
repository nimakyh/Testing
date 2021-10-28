package Hello;


import java.lang.constant.Constable;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        //Initialisering
        System.out.println("Welcome to EatRight - 30 day meal plan\n>     Press Enter to continue");

        String weightggainloss =( "    Weight gain or Weight loss \n Do you want to gain or lose weight? ");
        String gender = ("   Gender, Are you Male or Female? ");
        String age = ("   Age, How old are you? ");
        String weight = (" Weight, What is your Weight in kg");
        String height = (" Height, How tall are you in cm");

        String[] Answers = {"Gain", "Lose", "Male", "Female" };
        String[] gain;
        gain = new String[] {weightggainloss, gender, age, weight, height};
        int[] Age = {18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        boolean running = true;
        int n = userInput.nextInt();
        //here it begins

        while(running) {

            String command = userInput.nextLine();
            if (command.equalsIgnoreCase("2")) {
                System.out.println(gain[0]);
            }
            if (command.equalsIgnoreCase(Answers[0])) {
                System.out.print(gain[1]);
            } else if (command.equalsIgnoreCase(Answers[1])) {
                System.out.println(gain[1]);
            }

            if (command.equalsIgnoreCase(Answers[2])) {
                System.out.println(gain[2]);
                if (n >= Age[0] && n <= Age[0]) {
                    System.out.println(gain[3]);
                }
            }


        }




    }
}
