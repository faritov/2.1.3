import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean2 = (HelloWorld) applicationContext2.getBean("helloworld");
        System.out.println(bean2.getMessage());

        ApplicationContext applicationContext3 = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean3 = (HelloWorld) applicationContext2.getBean("helloworld");
        System.out.println(bean3.getMessage());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMeow());

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat bean1 = (Cat) applicationContext1.getBean("cat");
        System.out.println(bean1.getMeow());


        System.out.println(bean2==bean3);
        System.out.println(bean1==bean);


    }
}