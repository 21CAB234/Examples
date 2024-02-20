package example;

public class Array {
    public static void main(String[] args) {
        //Single Dimensional Array
        System.out.println("Single dimensional Array :");
        int []number={1,2,3,4,5,6,7,8,9};
        for(int i=0;i< number.length;i++){
            System.out.print (number[i]+" ");
        }
        System.out.println();
        //Multidimensional Array
        System.out.println("Multi dimensional Array 3 X 3:");
        int multidimensinal[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int row=0;row<multidimensinal.length;row++){
            for (int col=0;col<multidimensinal.length;col++){
                System.out.print(multidimensinal[row][col]+" ");
            }
            System.out.println();
        }
       // JaggedArray
        System.out.println();
        System.out.println("Jagged Array ");
        int jaggedarray[][]={{1,2,},{4,5},{7,8,9}};
        for (int row=0;row<jaggedarray.length;row++){
            for (int col=0;col<jaggedarray[row].length;col++){
                System.out.print(jaggedarray[row][col]+" ");
            }
            System.out.println();
        }
    }
}