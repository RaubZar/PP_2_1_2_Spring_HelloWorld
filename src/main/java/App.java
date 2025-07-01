import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld tree =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(tree.getMessage());
        HelloWorld leaf =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(leaf.getMessage());
        Cat one =
                (Cat) applicationContext.getBean("cat");
        System.out.println(one.getMessage());
        Cat two =
                (Cat) applicationContext.getBean("cat");
        System.out.println(two.getMessage());
    }
}