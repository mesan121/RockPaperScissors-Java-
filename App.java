import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello and welcome to my Rock Paper Scissors Game!");

        Integer User_score = 0;
        Integer Computer_score = 0;

        ArrayList<String> options = new ArrayList<String>();
        options.add("rock");
        options.add("paper");
        options.add("scissors");
        
        System.out.println(options.get(0));
        while (true) {
            Scanner user_answer = new Scanner(System.in);
            System.out.println("Just type in your answer either rock, paper or scissors or 2 to quit: ");

            String input = user_answer.nextLine();
            
            Integer random = (int)(Math.random() * 3);
            String random_1 = options.get(random);

            if (input == "q") {
                System.out.println("Thank you and we hope to see you again soon!");
                System.exit(0);//#endregion);

            }//Figure way to exit
        }
    }
}
