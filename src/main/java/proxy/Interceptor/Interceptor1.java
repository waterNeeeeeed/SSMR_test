package proxy.Interceptor;

import proxy.jdk.InterceptorJdkProxy;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2018/5/1.
 */
public class Interceptor1 implements Interceptor{
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器1】的before方法");
        return true;
    }

    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {

    }

    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("【拦截器1】的after方法");
    }
}
