import java.util.*;
public class Ejercicio5{
    public static void main(String[] args){
        Ejercicio5 e = new Ejercicio5();
    }

    final int nn = 100;
    final int exitValue = -50;
    int[]numbers = new int[nn];

    Scanner scanner = new Scanner(System.in);


    public Ejercicio5(){
        requestNumbers();
        double average = searchAverage();
        printValue(average);
    }
    private double  searchAverage() {
        int sum = 0;
        double average = 0;
        for(int i=0; i<nn;i++){
            int n2 = numbers[i];
            // System.out.println("n2: " + n2);
            // System.out.println("exitValue "+exitValue);

            if(n2 != exitValue){
                sum += numbers[i];
                // System.out.println("ii: "+i);
                average++;
                // System.out.println("a: "+average);

            }else{
                // System.out.println("//*Aquiii");

                break;
            }
            // System.out.println("ax: "+average);
            // System.out.println("sx: "+sum);
        }
        average = sum/average;
        return average;

    }
    public void requestNumbers(){
        int count = 0;

        do{
            System.out.println("Enter the number: ");
            numbers[count] = scanner.nextInt();
            count++;

        }while(count<nn && numbers[count-1]!=-50);
        
    }

    public void printValue(double average){
        // for(int i=0; i<nn;i++){
        // System.out.println(exitValue + " less "+ numbers[i] + " = "+(exitValue-numbers[i]));
        System.out.println("Average = " + average);
        }
}


