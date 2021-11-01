/*
    Make API easy
    Interface not required
    usually refactoring pattern
*/

package designpatterns.facade;

public class FacadeExample {
    public static void main(String[] args) {
        FacadePhone facadePhone = new FacadePhone();
        System.out.println(facadePhone.buildIPhone());
        System.out.println(facadePhone.buildMicrosoftPhone());
    }
}
