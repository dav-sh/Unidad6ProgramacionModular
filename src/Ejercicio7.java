import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args){
        Ejercicio7 e = new Ejercicio7();
    }    

    public Ejercicio7(){
        fill();
        print();
    }
    final int rows = 4;
    final int columns = 3;
    int[][] arr = new int[rows][columns];
    

    public void fill(){
        Random rand = new Random();
        
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                
                arr[i][j] = rand.nextInt(555);
                System.out.println("Row " + i+ " Column " + j + " n: " + arr[i][j]);
            }
        }
    }
    public void print(){
        int sum = 0;
        for(int i=0; i<rows;i++){
            if(i%2==0){
                for(int j=0; j<columns;j++){
                    sum+=arr[i][j];
                }

            }
        }
        System.out.println("sum: " + sum);
    }
    
    //System.out.println(arr[i][j]+" multiply by: "+2+" = "+ ((arr[i][j])*2));


}

    
