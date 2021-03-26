package com.yjs3509.linktoouter.domain;

public class Sequence{
	
	private Object[] items;
	private int index;

	public Sequence(int size) {
		this.items = new Object[size];
	}

	public void add(Object item) {
		if(index < items.length) {
			items[index++] = item;	
		}
	}
	
	public void add(Object item,int i) {
		if(i < items.length) {
			items[i] = item;	
		}
	}
	
	public Object get(int i) {
		return items[i];
	}
	
	
	private class SequenceIterator implements Iterator{

		private int index = 0;
		
		@Override
		public boolean end() {
			return this.index == items.length;
		}

		@Override
		public Object current() {
			return items[this.index];
		}

		@Override
		public void next() {
			if(this.index < items.length) { this.index++;	}
		}
		
	}
	
	public Iterator getIterator() {
		return new SequenceIterator();
	}

}
