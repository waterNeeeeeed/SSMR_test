package reflect;

/**
 * Created by lenovo on 2018/5/1.
 */
public class ReflectServiceImpl2 {
    private String name;

    public ReflectServiceImpl2(String name){
        this.name = name;
    }
    public void sayHello(){
        System.err.println("Hello " + name);
    }
}
