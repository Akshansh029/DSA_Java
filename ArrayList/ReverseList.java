
import java.util.ArrayList;

public class ReverseList {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(10);
        System.out.println("Original List: " + l1);

        int left = 0;
        int right = l1.size() - 1;
        while (left < right) {
            int temp = l1.get(left);
            l1.set(left, l1.get(right));
            l1.set(right, temp);
            left++;
            right--;
        }

        System.out.println(l1);
    }
}
