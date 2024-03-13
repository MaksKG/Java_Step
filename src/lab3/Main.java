package lab3;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        for (int value : arrList) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        int needToChange = 3;
        int newValue = 9;

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) == needToChange) {
                arrList.set(i, newValue);
                break;
            }
        }

        for (int value : arrList) {
            System.out.print(value + " ");
        }
        System.out.println("\n");
//_______________________________________________________________________
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);

        int changePosition = 2;
        int newElement = 3;

        if (changePosition < 0 || changePosition > linkedList.size()) {
            System.out.println("Incorrect position");
            return;
        }
        linkedList.add(changePosition, newElement);
        for (int value : linkedList) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

//__________________________________________________________________
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);

//      hashSet.clear();

        if (hashSet.isEmpty()) {
            System.out.println("Hash set is empty");
        } else {
            System.out.println("Hash set is not empty");
        }

//_____________________________________________________________________
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        map.clear();

        if (map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }
    }
}

