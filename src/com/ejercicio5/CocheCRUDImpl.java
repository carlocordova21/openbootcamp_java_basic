package com.ejercicio5;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void findAll() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void delete() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
