import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args){
        Ejercicio3 e = new Ejercicio3();
    }
    int[]numbers = new int[8];
    Scanner scanner = new Scanner(System.in);
    public Ejercicio3(){
        requestNumbers();
        searchNumber();
        printValue();
    }
    private void searchNumber() {
        System.out.println("Enter the number to search: ");
        int num = scanner.nextInt();
        boolean var = false; 
        for(int i=0; i<8;i++){
            if(numbers[i]==num){
                var = true;

            }
        }System.out.println("Is : " + var);
    }
    public void requestNumbers(){
        for(int i=0; i<8;i++){
            System.out.println("Enter the number: ");
            numbers[i] = scanner.nextInt();
        }
    }

    public void printValue(){

    }

}
