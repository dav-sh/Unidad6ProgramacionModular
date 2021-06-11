import java.util.*;
public class Ejercicio9{
    public static void main(String[] args){
        Ejercicio9 e = new Ejercicio9();
    }
    public Ejercicio9(){
        generateArrays();
        fillArrays();
        ///sumArrays();
    }
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    int row1,column1,row2,column2;
    
    int[][]data1;
    int[][]data2;
    public void generateArrays(){
        for(int i=0; i<2;i++){
            if(i==0){
                System.out.println("Enter row: ");
                row1 = scanner.nextInt();
                System.out.println("Enter column: ");
                column1 = scanner.nextInt();
                //row1 = rand.nextInt(3);
                //column1 = rand.nextInt(3);
                
            }else{
                System.out.println("Enter row: ");
                row2 = scanner.nextInt();
                System.out.println("Enter column: ");
                column2 = scanner.nextInt();
            }

        }
    }
    public void fillArrays(){
        data1=new int[row1][column1];
        data2=new int[row1][column2];

        //System.out.println("D1: "+row1+" "+column1);
        //System.out.println("D2: " +"  "+column2);

        for(int i=0; i<row1; i++){
            for(int j=0; j<column1; j++){
                data1[i][j] = rand.nextInt(10);
                
            }
        }
        for (int i = 0; i<row2; i++){
            for(int j=0; j<column2; j++){
                data2[i][j] = rand.nextInt(11)+10;
            }
        }
        sumArrays(data1, data2);
    }

    public void sumArrays(int[][] data1, int[][] data2){
        if(row1==row2&&column1==column2){
            int sum = 0;
            for(int i=0; i<row1; i++){
                for(int j=0; j<column1; j++){
                    sum+=data1[i][j]; 
                    
                }
            }
            for (int i = 0; i<row2; i++){
                for(int j=0; j<column2; j++){
                    sum+=data2[i][j]; 
                }
            }
            System.out.println("Result of sumArrays is: " + sum);
        }else{
            System.out.println("The length of the arrays are different");
        }
    }   

}