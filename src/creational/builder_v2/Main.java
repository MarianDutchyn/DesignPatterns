package creational.builder_v2;

public class Main {
    public static void main(String[] args) {
        IUser person = Person.get().setFirstName("test").setLastName("person").setAge(20)
                .setEmail("user@gamil.com").setPhone("+380631112233").setAddress("Lviv").build();

        System.out.println(person);
    }
}
