package proxy.jdk;

/**
 * Created by lenovo on 2018/5/1.
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHelloWorld(String name){
        System.out.println(name + ":Hello world");
    }
}
