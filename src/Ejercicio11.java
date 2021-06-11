import java.util.*;
public class Ejercicio11 {
    public static void main(String[] args){
        Ejercicio11 e = new Ejercicio11();
    }
    public Ejercicio11(){
        enterData();
        valueData();
        
    }
    double[]notes= new double[6];
    String[]names= new String[6];
    String[]result = new String[]{"Suspenso", "Bien","Notable","Sobresaliente"};
    Scanner scanner = new Scanner(System.in);
    public void enterData(){
        for(int i=0; i<6;i++){
            do{
                System.out.println(i+" Enter the note: ");
                notes[i]=scanner.nextDouble();
                scanner.nextLine();

            }while(notes[i]>=10 || notes[i]<0);
            System.out.println(i+ " Enter the name: ");
            names[i]=scanner.nextLine();

        }
    }
    public void valueData(){
        for(int i=0; i<6;i++){
            if(0<=notes[i] && notes[i]<5){
                System.out.println("Name: "+names[i]+" note: "+notes[i]+ " result: "+result[0]);
            }
            else if(5<=notes[i] && notes[i]<7){
                System.out.println("Name: "+names[i]+" note: "+notes[i]+ " result: "+result[1]);

            }
            else if(7<=notes[i] && notes[i]<9){
                System.out.println("Name: "+names[i]+" note: "+notes[i]+ " result: "+result[2]);

            }else{
                System.out.println("Name: "+names[i]+" note: "+notes[i]+ " result: "+result[3]);

            }
        }
    }
}
