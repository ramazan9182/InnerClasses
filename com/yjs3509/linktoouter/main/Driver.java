package com.yjs3509.linktoouter.main;

import com.yjs3509.linktoouter.domain.Iterator;
import com.yjs3509.linktoouter.domain.Sequence;

public class Driver {

	
	public static void main(String[] args) {
		
		int size = 10;
		
		Sequence sequence = new Sequence(size);
		
		for(int i = 0; i < size; i++ ) {
			sequence.add(new Integer(i));
		}
		
		sequence.add(new Integer(100), 3);
		
		Iterator iterator = sequence.getIterator();
		
		while (!iterator.end()) {
			
			System.out.println(iterator.current());
			
			iterator.next();
		}
		
	}
}
