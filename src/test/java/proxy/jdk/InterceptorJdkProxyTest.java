package proxy.jdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lenovo on 2018/5/1.
 */
class InterceptorJdkProxyTest {
    @Test
    void invoke() {
        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),
                "proxy.Interceptor.MyInterceptor");
        proxy.sayHelloWorld("TT");
    }

}