package com.example.lab.common;

public class Ret<T> {
    public  String info;
    public  T data;
    public Ret(String info, T data){
     this.info = info;
     this.data = data;
    }
}
