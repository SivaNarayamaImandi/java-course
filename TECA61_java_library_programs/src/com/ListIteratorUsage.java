package com;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorUsage {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		ListIterator<Integer> lt = arr.listIterator();
		System.out.println("Forword direction");
		while (lt.hasNext()) {
			int i = lt.nextIndex();
			Integer next = lt.next();
			System.out.println(i + "-->" + next);
			if (lt.nextIndex() == 6) {
				lt.add(70);
			}
		}
		System.out.println(arr);
		System.out.println("Backword direction");
		while (lt.hasPrevious()) {
			int j = lt.previousIndex();
			Integer previous = lt.previous();
			System.out.println(j + "-->" + previous);
			if (lt.previousIndex() == 5) {
				lt.set(100);
			} else if (lt.previousIndex() == -1) {
				lt.remove();
			}
		}
		System.out.println(arr);
	}
}
