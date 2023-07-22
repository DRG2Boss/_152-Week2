public class randomDiceRoll {
    public static void main(String[] args) {
        // Make a function to roll a single normal die
        // Call it and print out the roll number
        int roll = singleDie(10);
        System.out.println("You rolled a "+roll);
    }
    public static int singleDie(int sides) {
        int finalInt;
        double randomDouble = Math.random(); //.random function provides a floating point number >= 0.0 and < 1.0.
        // Normal case
        if(sides!=100) {
            // randomDouble * sides can be 0.000.. through sides -.000000..1
            // (int) command will truncate the decimal, so need to add one.
            finalInt = (int) (randomDouble * sides + 1);
        }
        // Special 100 die case
        else {
            // Start with 10 sided die.
            finalInt = (int) (randomDouble * 10 + 1);
            // Multiply it by 10 to get 10, 20, 30..ect
            finalInt = finalInt * 10;
        }
        return finalInt;
        // One way to verify this works, swap Math.random with range of possible numbers.
        // Other way, the Monte Carlo test. Run this a LOT of times (can use for loop for this) to verify accuracy. Example:
            /* for(int i=0; i<10000; i++) {
                    int roll = singleDie();
                    STOP the program if the roll is bad.
                    Good roll is roll>=1 && roll<=6
                    Bad roll is the opposite of this. Place expression in () and add "!" to apply the opposite of the expression.
                    if(!(roll>=1 && roll<=6)) {
                        System.out.println("BAD BAD BAD "+roll);
                    }
               System.out.println("Your roll is "+roll);
            }
            */
    }
}
