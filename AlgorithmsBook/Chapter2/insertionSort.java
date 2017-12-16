import java.util.*;

public class insertionSort{
    public static void main(String[] args){
        int[] listToSort = {5,2,4,6,1,3,30,12,7,9,8};

//sorts listToSort using merge sort
//outter for loop using control "j" is inefficient, the length of the list is not an accurate measurement
//to describe how many times it needs to iterate the inner for loop to sort a list
        for(int j = 0; j < listToSort.length; j = j + 1){
            for(int i=1; i < listToSort.length; i=i+1){
                if(listToSort[i] < listToSort[i-1]){
                    int temp = listToSort[i];
                    listToSort[i] = listToSort[i-1];
                    listToSort[i-1] = temp;
                }
            }
        }

        for(int i=0; i < listToSort.length; i=i+1){
            System.out.println(listToSort[i]);
        }



    }
}
