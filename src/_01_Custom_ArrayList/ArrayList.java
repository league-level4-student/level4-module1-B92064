package _01_Custom_ArrayList;

import org.omg.Messaging.SyncScopeHelper;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] arr;

	public ArrayList() {
		arr = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > arr.length - 1) {
			throw new IndexOutOfBoundsException();
		} else {
			System.out.println(arr[loc]);
			return arr[loc];
		}
	}

	public void add(T val) {
		T[] copyarr = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			copyarr[i] = arr[i];
		}
		copyarr[arr.length] = val;
		arr = copyarr;
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		for (int i = loc; i < arr.length - 1; i++) {
			T holder = arr[i + 1];
			arr[i + 1] = arr[i];
		}
		arr[loc] = val;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;

	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		arr[loc].equals(null);
	}

	public boolean contains(T val) {

		return false;
	}
}