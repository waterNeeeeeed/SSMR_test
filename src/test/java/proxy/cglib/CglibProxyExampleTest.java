package proxy.cglib;

import org.junit.jupiter.api.Test;
import reflect.ReflectServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lenovo on 2018/5/1.
 */
class CglibProxyExampleTest {
    @Test
    void getProxy() {
        CglibProxyExample cpe = new CglibProxyExample();
        ReflectServiceImpl obj = (ReflectServiceImpl)cpe.getProxy(ReflectServiceImpl.class);
        obj.sayHello("Cglib");
    }

}