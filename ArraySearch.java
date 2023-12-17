/*Searching an element in the array using a key;
 The key element sequentially compares every value in the array to check if the key is present in the array or not.
  */
public class ArraySearch {
    public static void main (String [] args) {
        int demo [] = new int [5];
        System.out.println("Array: ...");
        for(int i = 0; i< 5; i++) {
            demo [i] = i + 3;
            System.out.println("demo["+ i +"] =" + demo[i]);
        }
        for(int i = 0; i < 5; i++){
            if(demo [i] == 6)
                System.out.println("Element "+ 6 +" is found at index  " + i);
        }
    }
}
