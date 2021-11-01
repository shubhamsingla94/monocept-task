/*
            Factory Design Pattern
*   Doesn't expose instantiation or the creation login
*   Subclasses create the objects
*   Common Abstract/Interface
*   Framework, the client/ the implementation uses the factories

*/

package designpatterns.factory;

public class PhoneFactory {
    public static Phone getPhone(PhoneType phoneType) {
        switch (phoneType) {
            case ANDROID:
                return new AndroidPhone();
            case IPHONE:
                return new IPhone();
            default:
                return null;
        }
    }
}
