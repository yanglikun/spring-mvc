package spi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ServiceLoader;

/**
 * Created by yanglikun on 2016/8/25.
 */
public class SPITest {

    public static void main(String[] args) {
        ServiceLoader<Comparator> load = ServiceLoader.load(Comparator.class);
        Comparator<Integer> target = null;
        for (Comparator comparator : load) {
            target = comparator;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(1);
        list.add(2);
        Collections.sort(list, target);
        System.out.println(list);

    }
}
