import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        System.out.println("RECTANGLE AREA CALCULATOR");
        Scanner input = new Scanner (System.in);
        System.out.println("What's the length of side A?");
        float sideA = input.nextFloat();
        System.out.println("What's the length of side B?");
        float sideB = input.nextFloat();
        float area = sideA * sideB;
        System.out.println("The area of your rectangle is: " + area);
    }
}