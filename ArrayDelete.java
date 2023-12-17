/* 
 * 1. Start
 * 2. Set J = K
 * 3. Repeat steps 4 and 5 while J < N
 * 4. Set LA[J] = LA[J + 1]
 * 5. Set J = J+1
 * 6. Set N = N-1
 * 7. Stop
*/

public class ArrayDelete {
    public static void main (String [] args) {
        int delete [] = new int [3];
        int n = delete.length;
        System.out.println("Array before deletion is ...");

        //print array before deletion
        for(int i = 0; i < n; i++){
            delete[i] = i + 3;
            System.out.println("delete["+ i +"] =" + delete[i]);
        }
        for( int i = 1; i < n- 1; i++){
            delete[i] = i + 3;
            n = n -1;
        }
        System.out.println("Array after deletion...");
        for(int i = 0; i < n; i++){
            System.out.println("delete["+ i +"]=" + delete[i]);
        }
    }
    
}
