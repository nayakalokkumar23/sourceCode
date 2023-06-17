package com.strm.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddRanomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		 
	  	List<String> names = new ArrayList<String>();
    	names.add("Jai");
    	names.add("Mahesh");
    	names.add("Ajay");
    	names.add("Hemant");
    	names.add("Vishal");
		
    	String sJoin =names.stream().filter(i->!i.isEmpty()).collect(Collectors.joining(","));
    	
		for(int i = 1; i< 10; i++){
		      list.add(i);
		}
        
		List lst = list.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
           //System.out.println(lst);
           
           long ct = names.stream().filter(i-> i.length()<5).count();
        //   System.out.println(ct);
           
           String s = "java";
           
           
         //  s.chars().mapToObj(c -> (char)c).collect(Collectors.toSet()).forEach(System.out::println);
           
           Arrays.stream(s.split("")).collect(Collectors.toSet()).forEach(System.out::println);
          IntStream.iterate(1,  n->n+1).limit(100).forEach(System.out::println); 
          List<Integer>lstr = Arrays.asList(1,4,2,5,6,4,2,6,7,2,1,8,5,9);
          
          @SuppressWarnings("unchecked")
 		IntSummaryStatistics insm =  lstr.stream().mapToInt(n->n).summaryStatistics();
        System.out.println(insm.getCount());
         String str = "I am Alok nayak";
         
         System.out.println(Arrays.stream(str.split("")).collect(Collectors.groupingBy(i->i, Collectors.counting())));
         Arrays.stream(str.split("")).collect(Collectors.groupingBy(i->i, Collectors.counting()));
         System.out.println(str.chars().mapToObj(i->i).filter(i->i=='a').count());
    Map mp =     Arrays.stream(str.split("")).collect(Collectors.groupingBy(i->i, Collectors.counting()));
      
    IntStream.iterate(1, e->e*5).limit(10).forEach(System.out::println);
   // System.out.println(mp);
	}

}
