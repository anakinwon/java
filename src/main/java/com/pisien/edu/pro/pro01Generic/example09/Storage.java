package com.pisien.edu.pro.pro01Generic.example09;

// 상속 받을 조상이 제너릭이면,
// 자손도 무조건 제너릭으로 만들어야 한다.
// Storable<T>  →상속→  Storage<T>
public class Storage<T> implements Storable<T> {

    private T[] arr;

    public Storage(int size) {
        //this.arr = arr;
        this.arr = (T[])(new Object[size]);
    }

    @Override
    public void add(T item, int index) {
        this.arr[index] = item;

    }

    @Override
    public T get(int index) {
        return this.arr[index];
    }

    public T[] getT() {
        return this.arr;
    }

}
