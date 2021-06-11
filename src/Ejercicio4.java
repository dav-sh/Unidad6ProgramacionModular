import java.util.*;
public class Ejercicio4{
    public static void main(String[] args){
        Ejercicio4 e = new Ejercicio4();
    }

    final int nn = 10;
    int bigger = 0;
    int[]numbers = new int[nn];
    Random rnd = new Random();


    public Ejercicio4(){
        requestNumbers();
        searchNumber();
        printValue();
    }
    private void searchNumber() {
        for(int i=0; i<nn;i++){
            if(numbers[i]>bigger){
                bigger = numbers[i];

            }
        }
    }
    public void requestNumbers(){
        for(int i=0; i<nn;i++){
            numbers[i] = rnd.nextInt(10);
        }
    }

    public void printValue(){
        for(int i=0; i<nn;i++){
            System.out.println(bigger + " less "+ numbers[i] + " = "+(bigger-numbers[i]));
        }
    }

}
