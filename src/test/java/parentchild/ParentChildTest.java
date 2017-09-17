package parentchild;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ParentChildTest {

    private ClassPathXmlApplicationContext child;

    private ClassPathXmlApplicationContext parent;

    @Before
    public void init() {
        parent = new ClassPathXmlApplicationContext("parentchild/spring-parent.xml");
        child = new ClassPathXmlApplicationContext(new String[]{"parentchild/spring-child.xml"}, parent);
    }


    @Test
    public void testGetBean() {
        String childName = (String) child.getBean("name");
        String parentName = (String) parent.getBean("name");
        System.out.println(childName);
        System.out.println(parentName);
    }
}
