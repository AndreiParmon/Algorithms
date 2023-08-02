public class task1 {
    private Node head;
    private class Node{
        private Node next;
        private Node prev;
        private int value;
    }

    void needSort(){
        boolean needSort = false;
        do {
            needSort = false;
            Node node = head;
            while (node != null && node.next != null){
                if (node.value > node.next.value){
                    int temp = node.value;
                    node.value = node.next.value;
                    node.next.value = temp;
                    needSort = true;
                }
                node = node.next;
            }
        } while (needSort);
    }
    public void reversal(){
        if (head == null && head.next == null){
            return;
        }
        Node prev = null;
        Node current = null;
        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
