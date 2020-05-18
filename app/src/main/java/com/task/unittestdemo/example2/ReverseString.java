package com.task.unittestdemo.example2;

public class ReverseString {

    public String reverse(String str){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=str.length() - 1; i>= 0; i--){
            stringBuilder.append(str.charAt(i));
        }

        return stringBuilder.toString();
    }
}
