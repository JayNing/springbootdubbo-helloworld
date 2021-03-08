import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: AppXml
 * Description:
 * date: 2021/3/8 18:13
 *
 * @author ningjianjian
 */
public class AppXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"xml/provider.xml"});
        context.start();
        try {
            Thread.sleep(1000 * 1000); // 按任意键退出
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
