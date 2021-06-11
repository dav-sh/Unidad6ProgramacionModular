import java.util.*;
public class Ejercicio10{
    public static void main(String[] args){
        Ejercicio10 e = new Ejercicio10();
    }
    public Ejercicio10(){
        fillArrays();
        ///sumArrays();
    }
    Random rand = new Random();
    int row1=3;
    int column1=4;
    int row2=4;
    int column2=3;

    int[][]data1;
    int[][]data2;
   
    public void fillArrays(){
        //fill 1st array
        data1=new int[row1][column1];
        data2=new int[row2][column2];
        for(int i=0; i<row1; i++){
            for(int j=0; j<column1; j++){
                data1[i][j] = rand.nextInt(10);
                System.out.print(" "+data1[i][j]);
                
            }
            System.out.println(" ");
            
        }
        System.out.println(" ");
        //fill 2nd array
        for (int i = 0; i<row1; i++){

            for(int j=0; j<column1; j++){
                data2[j][i] = data1[i][j];
                System.out.print(" "+data2[j][i]);

            }
            System.out.println(" ");
        }

    }


}