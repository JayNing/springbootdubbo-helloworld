import com.ning.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: AppXml
 * Description:
 * date: 2021/3/8 18:17
 *
 * @author ningjianjian
 */
public class AppXml {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"xml/consumer.xml"});
        context.start();
        HelloService helloService = (HelloService)context.getBean("helloService"); // 获取远程服务代理
        String hello = helloService.sayHello("Jay"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
