package linkedlistprograms;
public class ReverseLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {

            // Save the next node
            Node next = current.next;

            // Reverse the link
            current.next = prev;

            // Move prev forward
            prev = current;

            // Move current forward
            current = next;
        }

        return prev;
    }

    static void displayOriginalNodes(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // Create a node list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Original node list:");
        displayOriginalNodes(head);//10,20,30,40

        // Reverse the linked list
        head = reverse(head);

        System.out.println("Reversed node list:");
        displayOriginalNodes(head);//40,30,20,10
    }
}

