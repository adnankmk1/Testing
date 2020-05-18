package com.task.unittestdemo.exercise2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

    public String removeDuplicate(String str){

        String resultString = new String();

        for(int i=0; i<str.length(); i++){

            char chr = str.charAt(i);

            if(resultString.indexOf(chr) < 0){
                resultString += chr;
            }
        }

        return resultString;
    }
}
