import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int temperature;

        System.out.print("Enter the temperature value in Celsius: ");
        temperature = keyboard.nextInt();

        if (temperature < 5){

            System.out.println("Advice: You can go skiing");

        }else if(temperature <= 15){

            System.out.println("Advice: You can go to a cinema");

        }else if(temperature <= 25){

            System.out.println("Advice: You can go to picnic");

        }else{

            System.out.println("Advice: You can go swimming");

        }

        //Alternative
        String advice = (temperature == -273) ? "Better Advice: You can go swimming in a volcano" : "You are lucky, it's not that cold(-273 Celsius)";
        System.out.println(advice);


    }
}
