package JFS.shop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
///**
// * Hello world!
// *
// */
// driver class
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
       MyShop obj=context.getBean(MyShop.class);
       obj.show();
    }
}
