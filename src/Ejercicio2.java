import java.util.*;
public class Ejercicio2{
    public static void main(String[] args){
        Ejercicio2 e2 =  new Ejercicio2();

    }

    int[] array = new int[10];
    Random rnd =  new Random();
    int count = 0;
    public Ejercicio2(){
        for(int i=0; i<10;i++){
            generateRandom(i);
        }
        int biggerNumber=biggerNumber();

        System.out.println("Here");
        for(int i= 0;i<10;i++){
            printValues(i);
            System.out.println("Here");

        }

        for(int i=0;i<10;i++){
            if(array[i]==biggerNumber){
                count++;
            }
        }printResult(biggerNumber, count);
        
    }


    public void generateRandom(int i){
        array[i]=rnd.nextInt(100);
    }


    public int biggerNumber(){
        int bigger = 0;
        for(int i=0; i<10;i++){
            if(array[i]>bigger){
                bigger = array[i];
            }
        }
        return bigger;
    }


    public void printResult(int biggerNumber, int count){
        System.out.println("Bigger number: "+biggerNumber);
        System.out.println("Bigger number repeats: "+count);
        
    }

    public void printValues(int i){
        System.out.println("Index: "+i+" number: "+array[i]);
    }


}