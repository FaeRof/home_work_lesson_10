package com.home_work_lesson_10.arraylist;
import java.util.Iterator;

public class ArrayList<X> implements Collection<X>{


    private X[] array;

    public ArrayList() {
        array = (X[]) new Object[0];

    }




    @Override
    public boolean add(X l) {
        try {
            X[] arrai = array;
            array = (X[]) new Object[arrai.length+1];
            System.arraycopy(arrai,0, array,0, arrai.length);
            array[array.length-1] = l;
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }



    @Override
    public void delete(int index) {
        try {
            X[] temp = array;
            array = (X[]) new Object[temp.length-1];
            System.arraycopy(temp,0,array,0,index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(
                    temp,index+1,
                    array,index,
                    amountElemAfterIndex);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    @Override
    public X get(int index) {
        return array[index];
    }
    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void change(int index, X l) {
        array[index]= l;
    }



    @Override
    public Iterator<X> iterator() {
        return new ArrayIterator<>(array);
    }

}
