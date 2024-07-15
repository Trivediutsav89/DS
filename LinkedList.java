public class LinkedList {
    class Node{
        int data;
        Node link;
        public Node(int data){
            this.data = data;
            this.link=null;
        }
        
    }
    Node first;
    public void insertAtFirst(int data){
        Node n = new Node(data);
        if(first==null){
            first = n;
        }else{
            n.link = first;
            first = n;
        }
    }
    public void display(){
        if(first==null){
            System.out.println("Linked List is empty");
        }
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.insertAtFirst(5);
        l1.display();
    }
}