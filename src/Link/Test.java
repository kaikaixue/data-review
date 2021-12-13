package Link;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = {3,3,5,1,3,7,1,5};
        LinkList<Integer> linkList = new LinkList<>();
        linkList.createR(arr);
        System.out.println("删除前" + linkList.toString());
        linkList.removeSame();
        System.out.println("删除后" + linkList.toString());
    }
}
