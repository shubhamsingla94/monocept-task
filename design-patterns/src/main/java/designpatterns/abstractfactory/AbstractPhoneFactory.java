/*
    Abstract Factory
    - Factory of factories/ related objects/ collection of factories
    - Common abstract class / interface
    - Subclasses create the objects
*/

package designpatterns.abstractfactory;

public abstract class AbstractPhoneFactory {
    // Windows Factory - Window Phone
    // Android Factory - Android Phone

    public static OSFactory getFactory(OSType osType) {
        switch (osType) {
            case ANDROID:
                return new AndroidFactory();
            case WINDOWS:
                return new WindowsFactory();
            default:
                return null;
        }
    }
}
