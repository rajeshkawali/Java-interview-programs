package com.programs.algorithmsort;

//A O(n) Java program to sort an input array in wave form
class SortWave
{
 // A utility method to swap two numbers.
 void swap(int arr[], int a, int b)
 {
     int temp = arr[a];
     arr[a] = arr[b];
     arr[b] = temp;
 }

 // This function sorts arr[0..n-1] in wave form, i.e.,
 // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
 void sortInWave(int arr[], int n)
 {
     // Traverse all even elements
     for (int i = 0; i < n; i+=2)
     {
         // If current even element is smaller
         // than previous
         if (i>0 && arr[i-1] > arr[i] )
             swap(arr, i-1, i);

         // If current even element is smaller
         // than next
         if (i<n-1 && arr[i] < arr[i+1] )
             swap(arr, i, i + 1);
     }
 }

 // Driver program to test above function
 public static void main(String args[])
 {
     SortWave ob = new SortWave();
     int arr[] = {10, 90, 49, 2, 1, 5, 23};
     int n = arr.length;
     ob.sortInWave(arr, n);
     for (int i : arr)
         System.out.print(i+" ");
 }
}
