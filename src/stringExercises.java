import java.util.Scanner;

public class stringExercises {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Read in a sentence and print it back.
        // If the user typed in a lower case i "so i feel hungry today"
        // We print the sentence back with an upper case I "so I feel hungry today"
        System.out.print("Enter a sentence that includes the word I in lower case: ");
        String sentence = keyboard.nextLine();
        // Make a new empty sentence string.
        String newSentence = "";
        // One approach.. ..notice this will do this for EVERY instance "i" appears, not just when it's its own word. Overly complicated.
        for(int i=0; i<sentence.length(); i++) {
                char x = sentence.charAt(i);
                if(x == 'i') {
                    x = 'I';
                }
                newSentence = newSentence + x;
            }
        System.out.println(newSentence);
        // Better approach next Monday

        // Terms that start with a capital letter, like "String" are CLASSES. Classes are like variable types.
        // "Hello class!" is an OBJECT. Object is a value of that variable type.
        // Variables like "myString" REFERS to the OBJECT.
        String myString = "Hello class!";

        // With an OBJECT, I can use "." to bring up:
        // 1. Variables INSIDE the object.
        // 2. Functions that ACT on the object.
        char x = myString.charAt(0);
        System.out.println("x is: " + x);


        // Make a program that for loops through a string printing out each char on its own line using myString.
        for(int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
        // Notice that the third item in a for loop (in this case i++), is just indicating what happens at the END of each for loop run.
        // Therefore, we can shorten this program even more.
        for (int i = 0; i < myString.length(); System.out.println(myString.charAt(i++))); // ";" used when for loop does not contain a body.


        // Prompt the user to enter EITHER yes or no.
        // KEEP prompting the user until they enter yes or no.
        // Setup keyboard as scanner variable.
        String word;
        while (true) {
            System.out.print("Choose yes or no: ");
            word = keyboard.next();
            // Read in a word.
            // Use if statement to create condition when word == yes or no.
            // Reminder that for STRINGS we cannot use "==", NEED to use ".equals"
            // NOTICE: .equalsIgnoreCase is the same action but will ignore the casing of the inputted data.
            if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("That's not a valid choice, try again.");
        }
        System.out.println("Nice work! You typed in " + word);
    }
}
