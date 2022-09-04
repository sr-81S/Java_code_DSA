package DSA_java;
import java.util.Scanner;

/*
  1 -> In this program 1st give the size of the array in and integer
  2 -> give the integer value and a space between it
  3 -> see the output minimum and maximum value in the array
* */

/*
   input & output

   input ->
            4 (size of array)
            15 18 6 8
   output ->
            min: 6 max: 18
**/

public class ArrayDsa02 {

    //find the minimum and maximum function
    static void minMax(int arr[]){
        int min = arr[0];
        int max = arr[0];
        int i=0;
        while(i<arr.length){
           if(arr[i]>max)
              max= arr[i];
           if(arr[i]<min)
               min= arr[i];

           i++;
        }
        System.out.println("min: "+min+" max: "+max);
    }

    //main function start
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ind = input.nextInt();
        int arr[] = new int[ind];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=input.nextInt();
        }
        minMax(arr);
    }
}
