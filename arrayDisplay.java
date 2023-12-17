public class arrayDisplay {
    public static void main(String [] args){
        int demo [] = new int [5];
        for (int i = 0; i < 5; i++){
             demo[i] = 10*(i + 2); 
            System.out.println("The element at index  [" +i+ "]  "+" is " + demo[ i]);
        }

    }
}
