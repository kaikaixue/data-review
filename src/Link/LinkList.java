package Link;

public class LinkList<E> {
    LinkNode<E> head;

    public LinkList () {
        head = new LinkNode<>();
        head.next = null;
    }

    /**
     * 头插法
     * @param a
     */
    public void createF(E[] a) {
        LinkNode<E> s;
        for (int i = 0; i < a.length; i++) {
            s = new LinkNode<>(a[i]);
            s.next = head.next;
            head.next = s;
        }
    }

    /**
     * 尾插法
     * @param a
     */
    public void createR(E[] a) {
        LinkNode<E> t;
        LinkNode<E> s;
        t = head;
        for (int i = 0; i < a.length; i++) {
            s = new LinkNode<>(a[i]);
            t.next = s;
            t = s;
        }
        t.next = null;
    }

    /**
     * 删除重复节点
     */
    public void removeSame() {
        if (head == null || head.next == null) {
            return;
        }

        LinkNode<E> outCur = head.next; // 外循环当前节点
        LinkNode<E> inPre;  // 内循环前驱节点
        LinkNode<E> inCur;  // 内循环当前节点，即外循环后继节点
        while (outCur != null) {
            inPre = outCur;
            inCur = outCur.next; // 初始为外循环后一个节点
            while (inCur != null) {
                if (outCur.data == inCur.data) {    // 如果相等
                    inPre.next = inCur.next;    // 通过前驱节点掉过相同的节点
                    inCur = inCur.next;     // 内循环当前节点后移
                } else {
                    inPre = inCur;  // 不相等，前驱节点后移
                    inCur = inCur.next; // 内循环当前节点后移
                }
            }
            outCur = outCur.next;
        }
    }

    /**
     * 打印单链表的值
     * @return
     */
    @Override
    public String toString() {
        LinkNode<E> t = head.next;
        String str = "";
        while (t != null) {
            str += t.data + " ";
            t = t.next;
        }
        return str;
    }
}
