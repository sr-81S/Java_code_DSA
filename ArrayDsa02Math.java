package DSA_java;

import java.util.Scanner;

public class ArrayDsa02Math {
    //find minimum and maximum number in given array

    //find min & max function with Math
    static void minMax(int arr[]){
        int min = arr[0];
        int max = arr[0];
        int i=0;
        while (i<arr.length){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
            i++;
        }
        System.out.println("min: "+min+" max: "+max);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ind = input.nextInt();
        int arr[] = new int[ind];
        for(int i=0;i<ind;i++){
            arr[i]=input.nextInt();
        }
        minMax(arr);
    }
}
