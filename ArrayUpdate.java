public class ArrayUpdate {
    public static void main(String [] args){
        int demo [] = new int[5];
        int item = 15;
        for(int i = 0; i < 5; i++){
            System.out.println("The array elements are...["+ i +"] =" + demo[i]  );

        }
        //insert elements from index 0 = 10 by a factor of i = i * 10
        System.out.println(" ");
        for(int i = 0; i< 5; i++){
            demo [i] = 10*(i + 1);
            System.out.println("The inserted elements are...["+ i +"] = " + demo[i]);
        }
        //Update the elements in index 2 from 30 to 15
        System.out.println(" ");
        demo [3] = item;
        System.out.println("Array elements after update are:...");
        for (int i = 0; i < 5; i++)
        System.out.println("demo["+ i + "] =" + demo[i]);
    }
}
