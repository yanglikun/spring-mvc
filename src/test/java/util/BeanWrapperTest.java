package util;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

/**
 * Created by yanglikun on 2016/8/18.
 */
public class BeanWrapperTest {

    static class User {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        User user = new User();
        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(user);
        print(user, bw);
        bw.setPropertyValue("name", "zs");
        print(user, bw);
        PropertyValue nameValue = new PropertyValue("name", "ls");
        bw.setPropertyValue(nameValue);
        print(user, bw);
    }

    private static void print(User user, BeanWrapper bw) {
        System.out.println(bw.getPropertyValue("name") + "," + user.getName());
    }
}
