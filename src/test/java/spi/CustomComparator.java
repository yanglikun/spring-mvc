package spi;

import java.util.Comparator;

/**
 * Created by yanglikun on 2016/8/25.
 */
public class CustomComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
