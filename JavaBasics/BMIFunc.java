// package JavaBasics;

import java.util.Scanner;

// Given the height (A) and weight (B) of a person as input in centimetres and kilograms.
// Find the BMI of that person and the classification of the user based on their BMI.
// Print Underweight if BMI < 18.5
// Print Normal if BMI lies in the range [18.5, 24.9]
// Print Overweight if BMI lies in the range (24.9, 29.9]
// Print Obese if BMI is greater than 29.9
// If x is the weight in kilograms and y is the height in metres.
// Then, BMI is calculated as x/(y*y).
//  Note: Use round(BMI,1) to get only one digit after decimal
public class BMIFunc {

    static void BMICalc(float weight, float height) {
        float bmi = Math.round((weight / (height * height)));
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi > 24.9) {
            System.out.println("Overweight");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in kgs: ");
        float weight = sc.nextFloat();
        System.out.print("Enter the height in m: ");
        float height = sc.nextFloat();
        BMICalc(weight, height);
        sc.close();
    }
}
