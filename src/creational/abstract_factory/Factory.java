package creational.abstract_factory;

public interface Factory<T> {
    T create(String speciality);
}
