import javax.swing.*;

public class randomnumgen {
  public static void main(String[] args) {
    int guesses = 0;
    int guess;
    int answer;
    String AnswerKnown = "Yes";
    String cont = "Yes";

    while (cont.equals("Yes")) {
      System.out.println("Game Start");
      answer = (int) (Math.random() * 100) + 1;
      while (AnswerKnown.equals("Yes")) {

        String t = JOptionPane.showInputDialog("Gissa");
        guess = Integer.parseInt(t);

        if (guess < answer) {
          System.out.println(guess + " was to low, guess again!");
          guesses++;
        }
        else if (guess > answer) {
          System.out.println(guess + " was to high, Guess again!");
          guesses++;
        }
        else {
          System.out.println(guess + " was correct!");
          System.out.println("You made " + guesses + " Guesses");
          AnswerKnown = JOptionPane.showInputDialog("Play again? Yes or No");
          guesses = 0;
          if (AnswerKnown.equals("Yes")) {
            System.out.println("Starting new game...");
            break;
          }
          else {
            System.out.println("Shutting down...");
            cont = "No";
          }
        }
      }
    }
  }
}
