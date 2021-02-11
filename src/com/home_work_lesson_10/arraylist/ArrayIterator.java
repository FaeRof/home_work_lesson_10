package com.home_work_lesson_10.arraylist;
import java.util.Iterator;

public class ArrayIterator<X> implements Iterator{
    private int index =0;
    private X[] array;


    ArrayIterator(X[]array){
        this.array=array;}


    @Override
    public boolean hasNext() {
        return index<array.length;
    }

    @Override
    public Object next() {
        return array[index++];
    }


}
