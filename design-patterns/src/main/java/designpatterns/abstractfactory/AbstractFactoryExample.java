package designpatterns.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        OSFactory factory = AbstractPhoneFactory.getFactory(OSType.ANDROID);
        Phone pixelPhone = factory.create(ManufacturerType.GOOGLE);
        pixelPhone.display();
    }
}
