package com.example.demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
/*		
		Set<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                  //using Comparator to sort elements in descending order.
                  return o2.compareTo(o1);
            }
     });
  treeSet.add(3);
  treeSet.add(12);
  treeSet.add(22);

  System.out.println("treeSet : "+treeSet);
*/
	}
}
