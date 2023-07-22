// Isaiah Marshall
// COMP 152
// July 19th and 20th 2023

// Need this line here if we want to use Scanner variable type because Scanner is NOT built in.
import java.util.Scanner;

// This is a class. Every java file is a class with the same name.
public class cheatSheet {
    // Your program must have a function called main that looks exactly like this.
    // This is a function, "void" means it doesn't return anything. Variable types used otherwise (int, String, ect.)
    public static void main(String[] args) {

        // Make some variables. Need to define them.
        // int is a whole number
        int exInt = 120;

        // char is a single character (not necessarily a letter) and uses '' to surround it, NOT "".
        char exChar = 'M';
        // Reassign and give a new value.
        exChar = '@';

        // double is a floating point number.
        double exDouble;
        exDouble = 4.2;
        // While the type of variable is defined, can't really use exDouble until a value is assigned to it.

        // String is a series of characters and uses "" to surround it. Note that String is CAPITALIZED.
        String exString = "Hello class";

        // boolean variable holds ONLY true or false.
        boolean exBoolean = false;

        /* Use block comments to make code disappear
        ERROR;
        ERROR 2;
         */

        // Want to read inputted data from user? Must use variable Scanner.
        // If we're using Scanner in our program, must do this *one time*
        // Make a Scanner object called keyboard
            // Notice that we need to pull in java.util.Scanner at top of the program.
        Scanner keyboard = new Scanner(System.in);
        // Notice that System.out displays information (outputs data) to the user, whereas System.in takes information from the user (inputs data).

        // Now use keyboard to read in stuff. For example:
        String exLine = keyboard.nextLine(); // Read an ENTER LINE, spaces included.
        // Be REALLY careful mixing "next" and "nextLine".
        exString = keyboard.next(); // Read a SINGLE WORD string.

        // If you input something below that is NOT a number, you will get an EXCEPTION.
            // EXCEPTION: stops the program, and it spits out a long series of red messages.
                // Notice exception type: Look down the list for the TOPMOST class you wrote, and the corresponding line number. That's where error occurred.
        exDouble = keyboard.nextDouble(); // Read a double.
        exInt = keyboard.nextInt(); // Read an integer.

        // Reminder, use System.out.println(..stuff..); to print out anything. "ln" portion of "println" indicates a new line will be created.
        System.out.println("You typed:");
        System.out.println(exLine);
        System.out.println(exString);
        System.out.println(exDouble);
        System.out.println(exInt);

        // Java is doing two things in the line below.
        System.out.println("The integer you typed is "+exInt+" and the double was "+exDouble);
            // First, it's making one big String using "+" to put things together.
                // "+" means CONCATENATE: to put a string and something else together into a big string.
            // Second, it's printing out the big string on a new line.

        // if statements
        if(exDouble == 42) {
            System.out.println("You typed 42.");
        }

        // if-elseif-elseif-...-else statements
        if(exInt == 1) {
            System.out.println("You typed 1.");
        }
        else if(exInt == 2) {
            System.out.println("You typed 2.");
        }
        else if(exInt == 3) {
            System.out.println("You typed 3.");
        }
        else {
            System.out.println("You typed something else.");
        }

        // More complex comparisons
        // || is OR, && is AND
        if(exInt < 80 || exInt >= 100) {
            System.out.println("The integer you typed is less than 80 or greater than/equal too 100.");
        }

        // PEMDAS:
            // Does exInt + exInt first,
            // Then multiplied by 3
            // Then mods 7%2 giving a remainder of 1
            // Then adds left side to exInt
            // Then subtracts the remainder of 1.
        int myAnswer = (exInt + exInt)*3+exInt-7%2;
        System.out.println("This evaluates to " +myAnswer);

        // If we divide two ints, we get an int. Any decimal remainder is THROWN AWAY, NOT rounded.
        System.out.println("7/2 is NOT "+(7/2));
        // So how do we round it?
        System.out.println("7/2 IS " +Math.round(7.0/2.0));
        // But I want my answer as an integer!
        // Can TYPECAST, which forces a double into an int without errors.
        // Can't just do int num = 7.0/2.0
        int num = (int) (7.0/2.0);
        // "(int)" acts on the very next value.

        // For loops repeating a fixed number of times.
        // Variable SCOPE: variables will only be available within the level of the curly brackets they are defined.
        for(int i=0; i<10; i++) {
            System.out.println("This prints 10 times.");
        }
        // Nested for loops used when doing a for loop within a for loop.
        for(int i=0; i<5; i++) {
            for(int j=0; j<4; j++) {
                System.out.println("Nested i is "+i+" and j is "+j);
            }
        }
        // We can make a grid using a nested for loop.
        for(int y=0; y<10; y++) {
            for(int x=0; x<5; x++) {
                System.out.print("("+x+","+y+") ");
            }
            System.out.println();
        }

        // While loops
        int someNum = 1;
        // Prints 1, 2, 4, 8, 16, 32, 64.
        while(someNum<100) {
            System.out.println(someNum);
            someNum = someNum*2;
        }
        // Order of statements in loop matters.
        someNum = 1;
        // Prints 2, 4, 8, 16, 32, 64, 128.
        while(someNum<100) {
            someNum = someNum*2;
            System.out.println(someNum);
        }
        // true = Run forever UNLESS "break" is used.
        while(true) {
            System.out.println("Type the word NO, please: ");
            String word = keyboard.next();
            // With STRINGS, cannot use "==". Instead use "word.equals".
            if(word.equals("NO")) {
                break;
            }
        }
        System.out.println("Good job!");

        // Sneak preview of array syntax (List is the Python term). More on this in week 3.
        int[] numArray = new int[10];
        // Put 10 in first position of array.
        numArray[0] = 10;

        // Using the squareNumber function defined below.
        int answer = squareNumber(5);
        System.out.println("The square of 5 is "+answer);
    }

    // Functions MUST be INSIDE the class, but OUTSIDE other functions.
    // Use these terms for defining a function:
        // public
        // static (will be removed in future work, include for now)
        // return type: int, double, char, String, or void (don't return anything)
        // name and parameters
    // Let's make a function that takes a number and squares it
    public static int squareNumber(int oneNum) {
        int squared = oneNum * oneNum;
        // If the function ISN'T void type, must return something.
        return squared;
    }
}
