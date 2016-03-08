package yu.personal.com.agentmodel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by YuHengYi on 2016/3/8.
 */
public class DynamicProxy implements InvocationHandler {
    private Object obj;
    public DynamicProxy(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(obj,args);

        return result;
    }
}
