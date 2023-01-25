import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(helloWorld.equals(helloWorld2));
        System.out.println(cat.equals(cat2));

        System.out.println(cat.getMessage());
    }
}