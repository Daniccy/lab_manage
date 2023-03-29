package com.example.lab.common;

public class Ret<T> {
    public int code;
    public  String info;
    public  T data;
    public Ret(int code, String info, T data){
     this.code = code;
     this.info = info;
     this.data = data;
    }
}
