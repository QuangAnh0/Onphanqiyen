package com.example.ontapphanquyen.service;

import java.util.Optional;

public interface BaseService<T> {
    Iterable<T> findAll();
    Optional<T> findById();
    T save(T t);
    void remove(Long id);
}
