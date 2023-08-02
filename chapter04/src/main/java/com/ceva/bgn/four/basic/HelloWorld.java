package com.ceva.bgn.four.basic;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List<String> items = List.of("1", "dos", "a", "3", "a", "b", "Jose");
        items.forEach((item)->{
            if(item.equals("a")){
                System.out.println("A");
            }else{
                System.out.println("Not A");
            }
        });
    }
}
