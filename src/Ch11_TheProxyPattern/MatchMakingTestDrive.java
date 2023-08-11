package Ch11_TheProxyPattern;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    Person getOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    Person getNonOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }

    public static void main(String[] args) {
        MatchMakingTestDrive testDrive = new MatchMakingTestDrive();
        testDrive.drive();
    }

    public void drive(){
        Person joe = new PersonImpl("Joe", "Male", "Programming");
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        System.out.println("Setting interests using the owner proxy");
        ownerProxy.setInterests("Mathematics");
        try {
            System.out.println("Trying to set Geek Rating using the owner proxy");
            ownerProxy.setGeekRating(10);
        } catch (Exception e){
            System.out.println("Can't set rating ..");
        }
        System.out.println("Rating is " + ownerProxy.getGeekRating());
        System.out.println("\n\n");
        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            System.out.println("Trying to set interests from the non owner proxy");
            nonOwnerProxy.setInterests("Physics");
        } catch (Exception e){
            System.out.println("Couldn't set interests ..");
        }
        System.out.println("Setting Geek Rating from the non owner proxy");
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
    }
}
