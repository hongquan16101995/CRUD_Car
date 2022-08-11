package com.example.crud_car.service;

import java.util.ArrayList;

public interface ICRUDService<E> {
    void create(E e);

    void update(E e);

    void deleteById(int id);

    ArrayList<E> findAll();

    E findById(int id);

    ArrayList<E> findAllByName(String name);

}
