package com.strm.demo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamExample {  
    public static void main(String[] args){  
        IntStream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(10)  
        .forEach(System.out::println);  
    }  
}  