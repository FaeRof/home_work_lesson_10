package com.home_work_lesson_10.arraylist;

public interface Collection<X> extends Iterable<X>{
    void change(int index, X l);
    void delete(int index);
    boolean add(X l);
    X get(int index);
    int size();

}