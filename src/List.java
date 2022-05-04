import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            list.add(sc.nextInt());

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

            for (Integer integer : list) {
                System.out.print(integer + " ");
            }

        }
    }
}