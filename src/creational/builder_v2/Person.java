package creational.builder_v2;

import creational.builder_v2.user.*;

public class Person implements IUser, IFirstName, ILastName, IAge, IEmail, IBuild {

    private final String EMPTY_STRING = "";

    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String address;

    private Person() {
        this.firstName = EMPTY_STRING;
        this.lastName = EMPTY_STRING;
        this.age = 0;
        this.email = EMPTY_STRING;
        this.phone = EMPTY_STRING;
        this.address = EMPTY_STRING;
    }

    public static Person get() {
        return new Person();
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public IEmail setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public IBuild setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public ILastName setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public IAge setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public IBuild setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public IBuild setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public IUser build() {
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
