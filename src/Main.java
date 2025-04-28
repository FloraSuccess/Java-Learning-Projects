import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // System.out.println("I love pasta!");
        // System.out.println("It should be with cream-cheese sous");

        int age = 21;
        int year = 2025;
        // System.out.println(age);
        // System.out.println("This is " + year);
        double price = 199999.99;
        double gpa = 3.5;
        double temperature = -12.5;
       /* System.out.println(price);
        System.out.println(gpa);
        System.out.println(temperature);
       */
        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        // System.out.println(grade);

        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Flora Success";
        String color = "Violet";
        String email = "fake123@gmail.com";
        String car = "Audi";
        System.out.println("My name is " + name);
        System.out.println("Your choice is " + color + " " + year + " " + car);
        System.out.println("The price is " + currency + price);

        if(forSale){
            System.out.println("There is an " + car + " for sale");
        }
        else {
            System.out.println("The " + car + " is not for sale");


        }
    }

}