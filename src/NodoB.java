public class NodoB<T> extends Nodo<T> {
    private NodoB<T> prev;

    public NodoB() {
        super();
        prev = null;
    }

    public NodoB(T valore) {
        super(valore);
        prev = null;
    }

    public NodoB<T> getSucc(){
        //return new NodoB<>(super.getSucc().getValore());
        return (NodoB<T>) succ;
    }
    
    public void setSucc(NodoB<T> succ) {
        this.succ = succ;
    }


    public NodoB<T> getPrev() {
        return prev;
    }

    public void setPrev(NodoB<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "NodoB [valore=" + valore + "]";
    }
}
