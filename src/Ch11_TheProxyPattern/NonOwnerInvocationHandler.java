package Ch11_TheProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if(method.getName().startsWith("get") || method.getName().equals("setGeekRating"))
                return method.invoke(person, args);
            else if(method.getName().startsWith("set"))
                throw new IllegalAccessException();
        } catch (InvocationTargetException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
