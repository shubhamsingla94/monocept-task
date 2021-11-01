/*
    Builder Pattern
*/

package designpatterns.builder;

public class BuilderExample {
    public static void main(String[] args) {
        Phone.Builder builder = new Phone.Builder()
                .backPanel("SandStone")
                .frontPanel("AMOLED")
                .processor("Snapdragon 888")
                .camera("12MP");

        Phone phone = builder.build();

        System.out.println(phone);
    }
}
