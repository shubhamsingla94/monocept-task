// Creates Bridge between two interfaces

package designpatterns.adapter;

public class AdapterExample {
    public static void main(String[] args) {
        AndroidCharger androidCharger = new AndroidCharger();
        AndroidPhone androidPhone = new OnePlus5();
        androidCharger.charge(androidPhone);

        IPhoneCharger iPhoneCharger = new IPhoneCharger();
        IPhone iPhone = new IPhoneX();
        iPhoneCharger.charge(iPhone);

        IPhone adapter = new AndroidToIPhoneAdapter(androidPhone);
        iPhoneCharger.charge(adapter);
    }
}
