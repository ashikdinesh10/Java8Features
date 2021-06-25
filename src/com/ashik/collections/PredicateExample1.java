package com.ashik.collections;


import java.util.ArrayList;
import java.util.function.Predicate;

import com.ashik.collections.pojos.Person;


public class PredicateExample1 {

	public static void main(String[] args) {
		
		ArrayList<Person>people=new ArrayList<Person>();
		people.add(new Person("Ashik",22));
		people.add(new Person("Ramu",34));
		people.add(new Person("Shambu",51));
		people.add(new Person("Kannan",36));
		people.add(new Person("Govind",29));
		
//		Predicate<Person>pred=new Predicate<Person>() {
//			
//			@Override
//			public boolean test(Person p) {
//				// TODO Auto-generated method stub
//				return (p.getAge()>30);
//			}
//		};
		Predicate<Person>predLow=(Person p) -> (p.getAge()<30);
		Predicate<Person>predHigh=(Person p) -> (p.getAge()>30);
//		for(Person p1:people) {
//			if(pred.test(p1)) {
//				System.out.println(p1);
//			}
//		}
		displayPeople(people,predLow);
		System.out.println("************");
		displayPeople(people,predHigh);
	}
	static void displayPeople(ArrayList<Person> people,Predicate<Person> predLow) {
		people.forEach(p1 -> {
			if(predLow.test(p1)) {
			System.out.println((p1));
			}
		});
	}
}
