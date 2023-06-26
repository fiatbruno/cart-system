package rw.fiat.cartsystem.services;

import rw.fiat.cartsystem.models.User;


public interface IUserService {

    User create(User user);

    boolean isNotUnique(User user);

    void validateNewRegistration(User user);

    User getLoggedInUser();

}