package nogeneric;

public class MyArrayList {
	private int size;
	private Object[] elementData;
	public MyArrayList() {
		elementData = new Object[10];
		size=0;
	}
	
	public void add(Object element) {
		elementData[size]=element;
		size++;
	}
	public int size() {
		return size;
	}
	public Object get(int index) {
		return elementData[index];
		
	}
	
	

}