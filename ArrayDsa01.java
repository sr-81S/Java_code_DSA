package DSA_java;
import java.util.Scanner;

/*
  1 -> In this program 1st give the size of the array in and integer
  2 -> give the integer value and a space between it
  3 -> see the output reverse of the array
* */

/*
   input & output

   input ->
            6 (size of array)
            1 2 3 4 5 6
   output ->
            6 5 4 3 2 1
**/


public class ArrayDsa01 {

    //print array function
    static void printArray(int arr[]){
        for (int x = 0;x<arr.length;x++){
            System.out.print(arr[x]+" ");
        }
    }

    //reverse array function
    static void reverseArray(int arr[]){
        int start =0;
        int end = arr.length -1;
        int tem ;
        while(start<end){
            tem = arr[start];
            arr[start] = arr[end];
            arr[end]=tem;
            start++;
            end--;
        }
        System.out.println();
        printArray(arr);
    }

    //the main function is start
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ind = input.nextInt();
        int arr[] = new int[ind];

        for (int i=0;i<=ind-1;i++) {
            arr[i] = input.nextInt();
        }
        printArray(arr);
        System.out.println();
        reverseArray(arr);
    }
}
