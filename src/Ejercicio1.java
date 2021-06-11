package src;
import java.util.*;

public class Ejercicio1{
    //Main method
    public static void main(String[] args){
        Ejercicio1 e1 = new Ejercicio1();
    }

    //constructor method 
    public Ejercicio1(){
        for(int i=0;i<5;i++){
            enterValue(i);
        }
        for(int i=0;i<5;i++){
            printValue(i);
        }
    }

    //Variables
    int[] numbers = new int[5];
    Scanner scanner = new Scanner(System.in);

    //Define the methods
    public void enterValue(int i){
        System.out.println("Enter the number: ");
        numbers[i]=scanner.nextInt();

    }

    public void printValue(int i){
        System.out.println("Index: "+i+" Number: "+numbers[i]);
    }



}