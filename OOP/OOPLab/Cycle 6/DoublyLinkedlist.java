
class Node {
    private Node Llink;
    private Node Rlink;
    private int data;

    public Node(int data) {
        this.data = data;
        this.Llink = null;
        this.Rlink = null;
    }

    public int getdata() {
        return this.data;
    }

    public void setNext(Node next) {
        this.Rlink = next;
    }

    public Node getNext() {
        return this.Rlink;
    }

    public void setPrev(Node prev) {
        this.Llink = prev;
    }

    public Node getPrev() {
        return this.Llink;
    }
}

class Doubly_Linkedlist {
    private Node Header;

    public Doubly_Linkedlist() {
        Header = new Node(0);
    }

    // Display
    public void display() {
        Node ptr;

        if (Header.getNext() == null) {
            System.out.println("No element. Cannot display");
        } else {
            ptr = Header.getNext();
            while (ptr != null) {
                System.out.print(ptr.getdata() + " ");
                ptr = ptr.getNext();
            }
            System.out.println();
        }

    }

    public void insertfront(int data) {
        Node New = new Node(data);

        if (Header == null) {
            Header = New;
        } else {
            New.setPrev(Header);
            New.setNext(Header.getNext());
            Header.setNext(New);
        }

    }

    public void insertend(int data) {
        Node New = new Node(data);

        if (Header == null) {
            Header = New;
        } else {
            Node ptr = Header;

            while (ptr.getNext() != null) {
                ptr = ptr.getNext();
            }

            New.setPrev(ptr);
            New.setNext(null);
            ptr.setNext(New);
        }

    }

    public void insertarbitary(int data, int where) {
        Node ptr = Header;

        while (ptr != null) {
            if (ptr.getdata() == where) {
                Node New = new Node(data);

                New.setPrev(ptr);
                New.setNext(ptr.getNext());
                ptr.setNext(New);

                return;
            }
            ptr = ptr.getNext();

        }

    }

    public int deletefront() {
        int item;
        Node ptr = Header.getNext();

        if (ptr.getNext() == null) {
            item = -99999;
            System.out.println("No element. Cannot delete");
        } else {
            item = ptr.getdata();
            Node ptr1 = ptr.getNext();
            Header.setNext(ptr1);
            if (ptr1 != null)
                ptr1.setPrev(Header);

            System.out.println("Deleted item = " + item);
        }

        return item;
    }

    public int deleteend() {
        int item;

        Node ptr = Header;
        while (ptr.getNext() != null) {
            ptr = ptr.getNext();
        }
        if (ptr == Header) {
            item = -99999;
            System.out.println("No element. Cannot delete");
        } else {
            item = ptr.getdata();
            Node ptr1 = ptr.getPrev();
            ptr1.setNext(null);
            System.out.println("Deleted item = " + item);

        }

        return item;
    }

    public int deletearbitary(int where) {

        Node ptr = Header.getNext();

        if (ptr == null) {
            System.out.println("No element. Cannot delete");

        } else {

            while (ptr.getdata() != where && ptr != null) {
                ptr = ptr.getNext();
            }
            if (ptr.getdata() == where) {
                Node ptr1 = ptr.getPrev();
                Node ptr2 = ptr.getNext();
                ptr1.setNext(ptr2);

                if (ptr2 != null)
                    ptr2.setPrev(ptr1);

                return ptr.getdata();

            } else
                System.out.println(where + " not found");

        }
        return -99999;
    }

}

public class DoublyLinkedlist {
    public static void main(String[] args) {
        Doubly_Linkedlist DLL = new Doubly_Linkedlist();
        DLL.insertfront(1);
        DLL.insertend(2);
        DLL.insertarbitary(3, 2);

        DLL.display();

        DLL.deletefront();
        DLL.display();
        DLL.deletearbitary(2);
        DLL.display();
        DLL.deleteend();
        DLL.display();

    }
}
