package Link;

public class LinkNode<E> {
    E data;
    LinkNode<E> next;

    public LinkNode () {
        this.next = null;
    }

    public LinkNode (E data) {
        this.data = data;
        this.next = null;
    }
}
