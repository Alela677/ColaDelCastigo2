package Cola;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

import javax.lang.model.element.Element;

import Exception.ColaExceededSizeException;
import Exception.ElementBlockedException;
import Exception.LlevateTuNullDeAquiException;

public class ColaDelCastigo<E> {

	ArrayList<Integer> num = new ArrayList<Integer>();

	public int compareTo(E o1, E o2) {
		// TODO Auto-generated method stub

		int r = 0;
		if (((String) o1).length() > ((String) o2).length()) {
			r = 1;
		} else if (((String) o1).length() < ((String) o2).length()) {
			r = -1;
		}
		return r;
	}

	public int size() {
		// TODO Auto-generated method stub
		return num.size();
	}

	public boolean isEmpty() throws Exception {
		// TODO Auto-generated method stub
		if (num.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		if (num.contains(o)) {
			return true;
		} else {
			return false;
		}

	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		num.remove((Object) num);
	}

	public boolean add(E e) throws Exception {
		// TODO Auto-generated method stub

		num.add((Integer) e);

		if (e == null) {

			throw new LlevateTuNullDeAquiException();

		}

		else if (num.size() > 10) {

			throw new ColaExceededSizeException();
		} else {

			return false;
		}

	}

	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	public E remove() throws Exception {
		// TODO Auto-generated method stub
		throw new ElementBlockedException();
	}

	public E poll() {
		// TODO Auto-generated method stub
		num.get(0);

		return (E) num.remove(0);
	}

	public E element() {
		// TODO Auto-generated method stub
		return (E) num.get(0);
	}

	public E peek() {
		// TODO Auto-generated method stub
		return (E) num.get(0);
	}

	public String toString() {
		return "ColaDelCastigo [num=" + num + "]";
	}

}
