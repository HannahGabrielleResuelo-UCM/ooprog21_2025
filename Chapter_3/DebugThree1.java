import java.util.Scanner;

class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();

        calcTip(check1);
        calcTip(check2);
    }

    public static void calcTip(double bill) {
        final double RATE = 0.15;
        double tip;
        tip = bill * RATE;
        System.out.println("The tip should be at least $" + tip);
    }
}

//errors in the code
//check1 = input.nextInt(); should be nextDouble()
//check2 inputnexrInt(); missing a dot (.)
//calcTip(check1); should be calcTip()
//final doublel RATE = 0.15; typo shoud be double 
//System.out.println("The tip should be at least $" + tip);
//tip = bill / RATE; wroong formula. Tip is bill x rate, not devide 
