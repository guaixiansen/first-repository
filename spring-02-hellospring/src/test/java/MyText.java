import com.guai.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class MyText {
    public static void main(String[] args) {
        //获取spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理，我们要使用，直接去里面取出来就可以!
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }
}
