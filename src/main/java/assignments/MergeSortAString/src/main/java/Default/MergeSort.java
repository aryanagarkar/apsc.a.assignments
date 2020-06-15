package Default;

import java.util.Arrays;
import java.util.Scanner;
import static junit.framework.Assert.*;

public class MergeSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("What are your words? Separate each word with a comma.");
        String words = s.nextLine();
        String[] wordArr = words.split(", ");

        printArray(mergeSort(wordArr, 0, wordArr.length - 1));
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

   	public static String[] mergeSort(String[] arr, int start, int end){
	    if(end - start == 0){
                String[] oneElementArr =  {arr[start]};
                return oneElementArr;
	    }
            
	    int mid = (start + end) / 2;
	    String[] half1 = mergeSort(arr, start, mid);
	    String[] half2 = mergeSort(arr, mid + 1, end);
	    return merge(half1, half2);
	}
	
	public static String[] merge(String[] a, String[] b){
	    int aIndex = 0;
	    int bIndex = 0;
	    int cIndex = 0;
            String[] c = new String[a.length + b.length];
	    while(aIndex < a.length && bIndex < b.length){
	        if(a[aIndex].compareToIgnoreCase(b[bIndex]) > 0){
	            c[cIndex] = b[bIndex];
	            bIndex++;
	        }
	        else if (a[aIndex].compareToIgnoreCase(b[bIndex]) < 0) {
	            c[cIndex] = a[aIndex];
	            aIndex++;
	        }
	        cIndex++;
	    }
	         System.arraycopy(a, aIndex, c, cIndex, a.length - aIndex);
	         System.arraycopy(b, bIndex, c, cIndex, b.length - bIndex);
	         return c;
	}

    public static void mergeSortTests() {
        String[] testArr1 = {"ab"};
        String[] expArr1 = {"ab"};
        
        String[] testArr2 = {"b", "a", "c", "d"};
        String[] expArr2 = {"a", "b", "c", "d"};
        
        String[] testArr3 = {"b", "a", "d", "c"};
        String[] expArr3 = {"a", "b", "c", "d"};
        
        String[] testArr4 = {"ab", "Aa", "ac"};
        String[] expArr4 = {"Aa", "ab", "ac"};
        
        String[] testArr5 = {"ABC", "aac", "aad", "abd", "aee", "AED"};
        String[] expArr5 = {"aac", "aad", "ABC", "abd", "AED", "aee"};
       
        try{
        assert Arrays.equals(mergeSort(testArr1, 0, testArr1.length - 1), expArr1);
        assert Arrays.equals(mergeSort(testArr2, 0, testArr2.length - 1), expArr2);
        assert Arrays.equals(mergeSort(testArr3, 0, testArr3.length - 1), expArr3);
        assert Arrays.equals(mergeSort(testArr4, 0, testArr4.length - 1), expArr4);
        assert Arrays.equals(mergeSort(testArr5, 0, testArr5.length - 1), expArr5);
        }
        catch(AssertionError e){
            System.out.println("Message " + e.getMessage());
        }
    }
}
