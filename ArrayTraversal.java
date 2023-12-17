/* Traversing an array is to print all elements in the array
 * Consider LA is a linear array with N elements and K is a positive integer such that K<=N.
 * Following is the algorithm to find an element with a value of ITEM using sequential search.
 */

public class ArrayTraversal {
    public static void main (String [] args){
        int demo [] = new int [5];
        System.out.println("The arrays elements are...");
        for (int i = 0; i < 5; i++){
            demo[i] = 20*(i + 1);
            System.out.println("demo["+ i +"] =" + demo[i]);
        }
    }
}
