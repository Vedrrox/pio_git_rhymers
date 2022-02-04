package edu.kis.vh.nursery.list;
/**
 * Klasa przetrzymuje listę dwukierunkową wartości liczb całkowitych
 */
public class IntLinkedList {

	public static final int FAIL = -1;
	private Node last;
	int i;
	
	/**
	 *i: wartość nowego Noda, która zostanie dodana do listy
	 * Funkcja dodaje element do listy
	 */

	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext( new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	/**
	 * Zwraca wartość true lub false w zależności od tego czy posiada element Node przypisany do pola last
	 */
	public boolean isEmpty() {
		return getLast() == null;
	}
	/**
	 * Zawsze zwraca wartość false, funkcja sprawdza, czy lista jest pełna
	 */
	public boolean isFull() {
		return false;
	}
	/**
	 * Zwraca wartość ostatniego Node w liście, jeżeli lista jest pusta zwraca kod błędu
	 */
	public int top() {
		if (isEmpty())
			return FAIL;
		return getLast().getValue();
	}
	/**
	 * Usuwa ostatni element z list, gdy lusta, jeżeli lista jest pusta zwraca kod błędu
	 */
	public int pop() {
		if (isEmpty())
			return FAIL;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}
	/**
	 * Zwraca ostatni Node
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * last: Node do dodania na koniec listy
	 * Dodaje element do końca listy
	 */
	public void setLast(Node last) {
		this.last = last;
	}

	public int getI() {
		return i;
	}



}
