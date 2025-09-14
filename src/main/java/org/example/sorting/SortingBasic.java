import java.util.*;
import java.lang.*;
import java.io.*;

public class SortingBasic
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int[] arr={5,16,4,7,8,3,1,2};
        bubbleSort(arr,arr.length);
        selectionSort(arr,arr.length);
        insertionSort(arr,arr.length);
	}
	//o(n^2)
	public static void insertionSort(int[] arr,int N){
	    for(int i=1;i<N;i++){
	        int j=i;
	        while(j>0 && (arr[j-1]>arr[j])){
	            int temp=arr[j];
	            arr[j]=arr[j-1];
	            arr[j-1]=temp;
	        }
	    }

	    System.out.println("Insertion Sorted Arr :");
	    printArr(arr);
	}

	//o(n^2)
	public static void selectionSort(int[] arr,int N){
	    for(int i=0;i<N;i++){
	        int minIdx=i;
	        for(int j=i;j<N;j++){
	            if(arr[minIdx]>arr[j]){
	                minIdx=j;
	            }
	        }
	        int temp=arr[minIdx];
	        arr[minIdx]=arr[i];
	        arr[i]=temp;
	    }
	    System.out.println("Selection Sorted Arr :");
	    printArr(arr);
	}

	//O(n^2)
	public static void bubbleSort(int[] arr,int N){
	    for(int i=0;i<N;i++){
	        for(int j=0;j<(N-1-i);j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j+1];
	                arr[j+1]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    System.out.println("Bubble Sorted Arr :");
	    printArr(arr);
	}

	public static void printArr(int[] arr){
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	    System.out.println("");
	}
}