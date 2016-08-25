package spi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ServiceLoader;

/**
 * <ul>
 * SPI(Service Provider Interface),自动发现接口的实现类
 * <ol>①在类路径下有目录META-INF/services目录</ol>
 * <ol>在①中的目录下添加文件，文件名就是 接口的名字</ol>
 * <ol>文件的内容就是实现类的全限定名，多个用逗号隔开</ol>
 * </ul>
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
