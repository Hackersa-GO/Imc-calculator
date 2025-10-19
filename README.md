The Body Mass Index (BMI) Calculator is a simple Java program designed to calculate a person’s BMI and interpret the result according to the classification defined by the World Health Organization. This project was created as part of a foundational Java learning path, focusing on essential programming concepts such as variables, arithmetic operators, conditional structures, and console output using System.out.println. It represents an important step in understanding programming logic and how code can be applied to solve real-world problems, even with small, straightforward programs.

The program works in a very simple way. It begins by declaring two double variables: one for the user’s height in meters and another for their weight in kilograms. Then, the BMI is calculated using the mathematical formula imc = peso / (altura * altura) (in English: bmi = weight / (height * height)). The result is printed to the console, and afterward, the program uses a series of conditional statements (if, else if, and else) to determine which BMI category the value belongs to. Each range corresponds to a different health classification, ranging from underweight to severe obesity.

Here’s the full code:

public class IMC {
    public static void main(String[] args) {
        double height = 1.75;
        double weight = 68.0;
        double bmi = weight / (height * height);

        System.out.println("Your BMI result is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Your weight is normal.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("You are obese.");
        } else {
            System.out.println("Severe obesity. Please seek medical advice.");
        }
    }
}


To run the program, you need to have the Java JDK installed and use a code editor or IDE such as VS Code, IntelliJ IDEA, or Eclipse. Save the code in a file named IMC.java, open your terminal in the same folder, and run the following commands:
javac IMC.java to compile and
java IMC to execute the program.
The result will be displayed in the console, showing both the calculated BMI and the corresponding classification.

For example, using the values weight = 68.0 and height = 1.75, the program produces the following output:

Your BMI result is: 22.20408163265306
Your weight is normal.


This indicates that the person is within the healthy weight range. If the weight variable were smaller, the program would print “You are underweight.” If it were higher, it would output “You are overweight” or “You are obese,” depending on the BMI value. This simple logic illustrates how Java evaluates boolean expressions and executes conditional branches based on different numerical comparisons.

Although the BMI Calculator is a small project, it is an excellent exercise for reinforcing programming fundamentals. It demonstrates how to work with double variables, apply mathematical formulas, and use conditional statements to handle different scenarios. It also trains clarity, precision, and output organization, which are essential in software development.

As you progress in your Java studies, this project can be improved in several ways. For instance, you could allow user input using the Scanner class, format the output to show only two decimal places, separate the calculation into a dedicated method, or even build a graphical interface version. These enhancements will add complexity and functionality, but the foundation remains the same: a simple, well-structured program that clearly shows how Java performs calculations, makes decisions, and displays results.
