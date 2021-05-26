import java.util.*;
public class RandomNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Define MAX, N, S: ");
        int MAX = in.nextInt();
        int N = in.nextInt();
        int S = in.nextInt();

        Random ran = new Random();
        int nxt;
        boolean generatingNewInt = true;
        ArrayList<Integer> numbers = new ArrayList<>(); // create an ArrayList object
        Set<Integer> treeSet = new TreeSet<>(); //create a treeSet

        while (generatingNewInt) {

            // generating integer
            nxt = ran.nextInt(MAX);

            numbers.add(nxt);
            treeSet.add(nxt);

            if (nxt == S){
                generatingNewInt = false;
            }
        }
        //printing all generated numbers
        System.out.println("All randomly generated numbers: " + numbers);

        //printing first and last N(or less) numbers generated
        if(numbers.size() >= N){
            System.out.print("First N numbers: ");
            for (int i = 0; i < N; i++) {
                System.out.print(numbers.get(i) + " ");
            }
            System.out.print("\nLast N numbers: ");
            for (int i = numbers.size()-1; i > numbers.size()-N-1; i--) {
                System.out.print(numbers.get(i) + " ");
            }
        }
        else{
            System.out.print("First N numbers: ");
            for (Integer number : numbers) {
                System.out.print(number + " ");
            }
            System.out.print("\nLast N numbers: ");
            for (int i = numbers.size()-1; i >=0; i--) {
                System.out.print(numbers.get(i) + " ");
            }
        }
        //printing all unique numbers sorted
        System.out.println("\nAll unique numbers sorted: " +  treeSet);
    }
}
