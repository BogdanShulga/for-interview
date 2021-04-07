package stageOne;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(67);
        list.add(3);
        list.add(0);
        list.add(232);
        list.add(6);
        list.add(5);

//        for (Integer i : list) {
////            i = i + 18;
//            list.remove(i);
//        }

//        for (int i = 0; i < list.size(); i++) {
//            list.remove(i);
//        }
//
//        for (Integer i : list) {
//            System.out.print(i + "  ");
//        }
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp > 2) iterator.remove();

        }

    }
}
