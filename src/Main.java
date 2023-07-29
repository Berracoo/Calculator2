import java.util.Scanner;

public class Main {
    static void addition() {
        int i, number, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many times would you like to add : ");
        int times = input.nextInt();
        for (i = 1; i <= times; i++) {
            System.out.print(i + ". number that will be added : ");
            number = input.nextInt();
            result += number;
        }
        System.out.println("Final result : " + result);

    }

    static void subtraction() {
        int i, number, result;
        Scanner input = new Scanner(System.in);
        System.out.print("How many times will you subtract : ");
        int times = input.nextInt();
        System.out.print("First number will be :");
        result = input.nextInt();
        // the reason we take result as the first number is because the process starts by subtracting from the result.
        // if we were to make it start from 0 the result would be automatically negative.

        for (i = 1; i < times; i++) {
            System.out.print(i + 1 + ". number that will be subtracted : ");
            number = input.nextInt();
            result -= number;
        }
        System.out.println("Final result : " + result);
    }

    static void multiplication() {
        int i, number, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("How many times would you like to multiply : ");
        int times = input.nextInt();
        for (i = 1; i <= times; i++) {
            System.out.print(i + ". number that will be multiplied : ");
            number = input.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Final result : " + result);

    }

    static void division() {
        int i, number, result;
        Scanner input = new Scanner(System.in);
        System.out.print("How many times will you divide : ");
        int times = input.nextInt();
        System.out.print("First number will be : ");
        result = input.nextInt();
        for (i = 1; i < times; i++) {
            System.out.print(i + 1 + ". number that will divide : ");
            number = input.nextInt();
            if (number == 0) {
                // Letting the user know that trying to divide a number with zero will cause java to throw an exception and
                // explaining what that exception means.
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            result /= number;
        }
        System.out.println("Final result : " + result);
    }

    static void factorial() {
        int i, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Until which number the factorial will be executed : ");
        int times = input.nextInt();
        // factorial 0 and 1 = 1 ,so we directly get the result without going through the loop.
        while (times == 0 || times == 1) {
            result = 1;
            break;
        }
        for (i = 1; i <= times; i++) {
            result *= i;
        }
        System.out.println("Final result : " + result);
    }

    static void involution() {
        int exponent, power, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Which number will you choose as an exponent : ");
        exponent = input.nextInt();
        System.out.print("Which number will you choose as a power : ");
        power = input.nextInt();
        // when the power equals to 0 the result will directly equal to 1 ,so we stop the scope beforehand.
        while (power == 0) {
            result = 1;
            break;
        }
        for (int i = 1; i <= power; i++) {
            // when the exponent equals to 1, the result will directly equal to 1, so we don't need to read the rest of the code.
            if (exponent == 1) {
                result = 1;
                break;
                // when exponent is zero the result will be automatically zero.
            } else if (exponent == 0) {
                result = 0;
                break;
            }
            result *= exponent;
        }
        System.out.println("Final result : " + result);
    }

    static void modding() {
        int dividend, divider, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a dividend : ");
        dividend = input.nextInt();
        System.out.print("Choose a divider : ");
        divider = input.nextInt();
        while (dividend == divider) {
            result = 1;
            break;
        }
        if (divider == 0) {
            // Letting the user know that trying to divide a number with zero will cause java to throw an exception and
            // explaining what that exception means.
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        // modding is a process of dividing the dividend with the divider while using % sign and getting a remainder as a result.
        // When you take the divisor negative in a modulo operation, it will lead to the same result as using the positive value of the divisor.
        // The sign of the divisor does not affect the outcome of the modulo operation.
        result = dividend % divider;
        System.out.println("Final result : " + result);
    }

    static void areaAndCircumferenceOfRectangle() {
        int width, length, area, circumference;
        Scanner input = new Scanner(System.in);
        System.out.print("Choose the width of the rectangle : ");
        width = input.nextInt();
        System.out.print("Choose the length of the rectangle : ");
        length = input.nextInt();
        while (width <= 0 || length <= 0) {
            System.out.println("Make sure the values for the width and the length are greater than zero !");
            System.out.print("Width : ");
            width = input.nextInt();
            System.out.print("Length : ");
            length = input.nextInt();
        }
        area = width * length;
        circumference = 2 * (width + length);
        System.out.println("The area of the rectangle : " + area + "\n" + "The circumference of the rectangle : " + circumference);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        System.out.println("Below is what this calculation machine can do : ");
        String menu =
                "1- Addition \n"
                + "2- Subtraction \n"
                + "3- Multiplication \n"
                + "4- Division \n"
                + "5- Involution \n"
                + "6- Factorial \n"
                + "7- Modding \n"
                + "8- Area and Circumference of Rectangle \n"
                + "0- Log out ";

        do {
            System.out.println(menu);
            System.out.print(" Please choose an operation :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    involution();
                    break;
                case 6:
                    factorial();
                    break;
                case 0:
                    System.out.println("Logging out of the app, see you later!");
                    break;
                default:
                    System.out.println("Please be sure to choose an operation that includes above.");
            }
        } while (select != 0);


    }
}