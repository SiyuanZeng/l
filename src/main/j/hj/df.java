package main.j.hj;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class df implements Iterable<String>{
	// this is the name for the songs
	// how to links to the sources
	// name and source
	// ho wot store the source anms name
//	and i need to retsrive

	private List<String> list = new LinkedList<>();

	public List<String> getList() {
		return list;
	}

	public df(List<String> list) {
		this.list = list;
	}

	public df() {
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void moveUp(int i) {
		if (i > 0) {
			String swap = this.list.get(i-1);
			this.list.set(i-1, this.list.get(i));
			this.list.set(i, swap);
		}
	}
	
	public void moveDown(int i) {
		if (i < this.list.size() - 1) {
			String swap = this.list.get(i+1);
			this.list.set(i+1, this.list.get(i));
			this.list.set(i, swap);
		}
	}
	
	public void add(String item) {
		this.list.add(item);
	}
	
	public void editAt(int i, String newValue){
		if (i >= 0 && i < this.list.size()) {
			this.list.set(i, newValue);
		}
	}
	
	public void removeAt(int i) {
		if (i >= 0 && i < this.list.size()) {
			this.list.remove(i);
		}
	}
	
	public int size() {
		return list.size();
	}
	
	public String elementAt(int i) {
		return list.get(i);
	}
	
	@Override
	public Iterator<String> iterator() {
		return list.iterator();
	}
}
