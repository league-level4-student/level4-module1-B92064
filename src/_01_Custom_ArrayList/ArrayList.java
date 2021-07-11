package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] arr;

	public ArrayList() {
		arr = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {
		if (loc < 0 || loc > arr.length) {
			throw new IndexOutOfBoundsException();
		}
		return arr[loc];
	}

	public void add(T val) {
		T[] copyarr = (T[]) new Object[arr.length + 1];
		for (int i = 0; i < copyarr.length; i++) {
			if (i == arr.length) {
				copyarr[i] = val;
			} else {
				copyarr[i] = arr[i];
			}
		}
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {

	}

	public boolean contains(T val) {

		return false;
	}
}