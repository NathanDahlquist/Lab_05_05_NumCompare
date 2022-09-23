public class NumCompare {
    public static void main(String[] args) {
        double num1;
        double num2;

        System.out.println("Please enter your first number.");
        num1 = 2;
        System.out.println("Please enter your second number");
        num2 = 7;

        if (num1 == num2){
            System.out.println("Your two numbers are equal.");
        }else if (num1 > num2){
            System.out.println("The first number is greater than the second.");
        }else if (num1 < num2){
            System.out.println("The first number is less than the second.");
        }else{
            System.out.println("You have entered a non-number. Please try again.");
        }
    }
}
