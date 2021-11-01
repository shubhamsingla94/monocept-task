/*
        Decorator Design Pattern
        Wrapper
        Add functionality or behavior
        Single Responsibility Principle
        Dynamically compose behavior
        Inheritance and Composition
*/

package designpatterns.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Phone androidPhone = new AndroidPhone(new BasicPhone());
        System.out.println(androidPhone.build());

        Phone applePhone = new ApplePhone(new BasicPhone());
        System.out.println(applePhone.build());

        Phone nokiaPhone = new NokiaPhone(new WindowsPhone(new BasicPhone()));
        System.out.println(nokiaPhone.build());
    }
}
