import java.util.*;
public class Ejercicio8{
    public static void main(String[] args){
        Ejercicio8 e = new Ejercicio8();
    }
    Scanner scanner = new Scanner(System.in);
    public Ejercicio8(){
        requestString();
        compareString();

    }
    final int n = 5;
    String[] t1 = new String[n];
    String[] t2 = new String[n];
    public void requestString() {
        
        for (int i = 0; i<n;i++){
            System.out.println("1. Enter the text: ");
            t1[i]=scanner.nextLine();
        }
        for (int i = 0; i<n;i++){
            System.out.println("2. Enter the text: ");
            t2[i]=scanner.nextLine();
        }
    }

    public void compareString() {
        for (int i = 0; i<n;i++){
            if(t1[i].length() == t2[i].length()){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}


