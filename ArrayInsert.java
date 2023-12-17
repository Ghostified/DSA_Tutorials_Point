/* Start
 * craete an array of desired type and size
 * initialize a variable i as 0
 * enter an element at the ith index of the array
 * increment i by 1
 * repeat 4 & 5 untill the end of the array
 * stop
 */

public class ArrayInsert {
    public static void main (String [] args){
        int insert [] = new int [3];
        System.out.println("Array before insertion");

        //print an empty array
        for(int i = 0; i<3; i++){
            System.out.println("insert["+ i +"] =" + insert[i]);
        System.out.println("Inserting elements..");

        //printing array after insertion
        System.out.println("Array after insertion");
        for (i =0; i< 3; i++){
            insert[i]= i+3;
            System.out.println( "insert["+ i +"] = " + insert[i]);
        }
        }
        }
}
