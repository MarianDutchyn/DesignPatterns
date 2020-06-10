package creational.builder_v2.user;

import creational.builder_v2.IUser;

public interface IBuild {
    IBuild setPhone(String phone);

    IBuild setAddress(String address);

    IUser build();
}
