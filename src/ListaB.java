public class ListaB<T> {
    NodoB<T> first, last;

    public ListaB() {
        first = last = null;
    }

    public int getSize() {

        if (first == null)
            return 0;

        int size = 1;
        NodoB<T> tmp = first;

        while (tmp.getSucc() != null) {
            size++;
            tmp = tmp.getSucc();
        }

        return size;
    }

    public void addTail(T value) {
        NodoB<T> newnodo = new NodoB<>(value);
        if (first == null) {
            first = last = newnodo;
        } else {
            last.setSucc(newnodo);
            newnodo.setPrev(last);
            last = newnodo;
        }
    }

    public void addHead(T value) {
        NodoB<T> newnodo = new NodoB<>(value);
        if (first == null) {
            first = newnodo;
            last = newnodo;
        } else {
            first.setPrev(newnodo);
            newnodo.setSucc(first);
            first = newnodo;
        }
    }

    public void addPosition(int pos, T value) {

        NodoB<T> newnodo = new NodoB<>(value);
        int size = getSize();

        if (pos < 0 || pos > size) {
            System.out.println("Indice non valido");
            return;
        }

        if (pos > size / 2) {

            NodoB<T> tmp = last;
            for (int i = size - 1; i > pos; i--) tmp = tmp.getPrev();
            
            newnodo.setPrev(tmp.getPrev());
            newnodo.setSucc(tmp);
            if (tmp.getPrev() != null) {
                tmp.getPrev().setSucc(newnodo);
            }
            tmp.setPrev(newnodo);
        } else {
            NodoB<T> tmp = first;
            for (int i = 0; i < pos - 1; i++) {
                tmp = tmp.getSucc();
                pos--;
            }
            newnodo.setSucc(tmp.getSucc());
            newnodo.setPrev(tmp);
            tmp.setSucc(newnodo);
        }
    }

    @Override
    public String toString() {
        String s = "";
        NodoB<T> tmp = first;
        while (tmp != null) {
            s += tmp.getValore() + "\t";
            tmp = tmp.getSucc();
        }
        return s;
    }

    public String toStringReversed() {
        String s = "";
        NodoB<T> tmp = last;
        while (tmp.getPrev() != null) {
            s += tmp.getValore();
            tmp = tmp.getPrev();
        }
        return s;
    }
}
