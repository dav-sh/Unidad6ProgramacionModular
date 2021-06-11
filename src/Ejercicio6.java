public class Ejercicio6 {
    public static void main(String[] args){
        Ejercicio6 e = new Ejercicio6();
    }    

    public Ejercicio6(){
        multiply();
    }

    

    public void multiply(){
        int rows = 3;
        int columns = 3;
        int[][] arr = new int[rows][columns];
        arr[0][0] =5;
        arr[1][0]=14;
        arr[2][0]=21;
        arr[0][1] =6;
        arr[1][1] =2;
        arr[2][1]=7;
        arr[0][2] =13;
        arr[1][2] =4;
        arr[2][2] =6;

        for(int i=0; i<rows;i++){
            for(int j=0; j<columns;j++){
                System.out.println(arr[i][j]+" multiply by: "+2+" = "+ ((arr[i][j])*2));
            }
        }
    }




}

    
