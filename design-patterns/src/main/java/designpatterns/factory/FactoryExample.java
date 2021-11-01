package designpatterns.factory;

public class FactoryExample {
    public static void main(String[] args) {
        Phone android = PhoneFactory.getPhone(PhoneType.ANDROID);
        Phone iPhone = PhoneFactory.getPhone(PhoneType.IPHONE);

        System.out.println(android);
        System.out.println(iPhone);
    }
}
