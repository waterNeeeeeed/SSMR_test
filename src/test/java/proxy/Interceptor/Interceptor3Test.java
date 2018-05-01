package proxy.Interceptor;

import com.sun.xml.internal.ws.api.message.HeaderList;
import org.junit.jupiter.api.Test;
import proxy.jdk.HelloWorld;
import proxy.jdk.HelloWorldImpl;
import proxy.jdk.InterceptorJdkProxy;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lenovo on 2018/5/1.
 */
class Interceptor3Test {
    @Test
    public void main(){
        HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(
                new HelloWorldImpl(), "proxy.Interceptor.Interceptor1");
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(
                proxy1, "proxy.Interceptor.Interceptor2");
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(
                proxy2, "proxy.Interceptor.Interceptor3");
        proxy3.sayHelloWorld("tao");
    }
}