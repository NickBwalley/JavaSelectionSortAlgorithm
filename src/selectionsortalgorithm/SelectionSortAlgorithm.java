/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsortalgorithm;

/**
 *
 * @author NICK.BWALLEY
 */
public class SelectionSortAlgorithm {

    public static void main(String[] args) {
        
        int[] sampleArray = {5,44,79,20,19};
        
       /* int[] result = selectionSort(sampleArray);
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }*/
        
       maxiElement(sampleArray);
    }
    //function to determine the largest number in the sampleArray
    public static void maxiElement(int [] data){
        int n = data.length;
        
        //assume the max number is the first one 
        int maxi = data[0];
        for (int i = 1; i < n; i++) {
            if(data[i] > maxi){
                maxi = data[i];
            }
        }
        System.out.println(maxi);
    }
    //function to selection sort the numbers in the sampleArray 
    public static int[] selectionSort (int arr[]){
         int n = arr.length; //size of the array
         
         for (int i = 0; i < n; i++) {
             int minIndex = i;
             
             for (int j = i; j < n; j++) {
                 if(arr[j] < arr[minIndex]){
                        minIndex = j;
                 }
                 
             }
             //swap the smallest number with the number at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
        }
         return arr;
    }
    
}
//ctrl +/ for adding a single line comment
/*bcom + tab to add a multiline comment */

/*computing the running time complexity of the selection sort array*/
/*the outer loop basically says how many loop do we need to do in order to compute the inner loop
when i =0 the inner loop has to a number of comparisons do you need to make 
//this is nick
//running time complexity = O(n^2)



*/

