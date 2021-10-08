package by.epamtc.task02.ball.scaner;

import java.util.Scanner;

public class Scan {

    public double doubleReadFromConsole(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()){
            String value = scanner.next();
            System.out.println("You've set wrong value: " + value + "\nTry again");
            scanner.hasNextDouble();
        }
        return scanner.nextDouble();
    }
}