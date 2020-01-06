
public class QueLinkedList<E> {
	public E weekday;
	public Node<E> start;
	int c = 0;
	Weekday wd = null;

	public QueLinkedList() {
		weekday = null;
		start = null;

	}

	public void add(E wd) {
		Node<E> n = new Node<E>();

		n.setdata(wd);
		n.setNext(start);

		if (start == null) {
			start = n;
		} else {
			Node<E> t;
			t = start;
			while (t.getNext() != null) {
				t = t.getNext();
			}
			t.setNext(n);
			n.setNext(null);
		}
	}

	public Weekday remove() {
		if (start != null) {
			wd = (Weekday) start.getdata();
			start = start.getNext();
			return wd;
		} else {
			return null;
		}
	}

}
