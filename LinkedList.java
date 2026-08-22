class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedListCreation{
    Node head;
    LinkedListCreation(){
        head=null;
    }

    public void insertAtBeginning(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void insertAtMidAfter(int data,int aft){
        Node newNode=new Node(data);

        Node temp=head;

        while(temp.next!=null && temp.data!=aft){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void insertAtMidBefore(int data,int bef){
        Node newNode=new Node(data);

        Node temp=head;
        Node temp1=head;
        while(temp.next!=null && temp.data!=bef){
            temp1=temp;
            temp=temp.next;
        }
        newNode.next=temp1.next;
        temp1.next=newNode;
    }

    public void inserAtEnding(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public void deleteAtBegining(){
        head=head.next;

    }

    public void deleteAtEnding(){
        Node temp=head;
        Node temp1=null;
        while(temp.next!=null ){
            temp1=temp;
            temp=temp.next;
            

        }
        temp1.next=null;

    }

    public void deleteAtMiddle(int data){
        Node temp=head;
        Node temp1=null;
        while(temp.next!=null && temp.data!=data){
            temp1=temp;
            temp=temp.next;
        }
        temp1.next=temp.next;

    }
    public void traverse(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

class LinkedList{
    public static void main(String[]args){
        
        LinkedListCreation obj=new LinkedListCreation();

        // obj.insertAtBeginning(10);
        // obj.insertAtBeginning(20);
        // obj.insertAtBeginning(30);
        // obj.insertAtBeginning(40);

        obj.inserAtEnding(10);
        obj.inserAtEnding(20);
        obj.inserAtEnding(30);
        obj.inserAtEnding(40);

        // obj.insertAtMidAfter(25,20);
        // obj.insertAtMidBefore(25, 30);
        // obj.deleteAtBegining();
        // obj.deleteAtEnding();
        obj.deleteAtMiddle(30);

        obj.traverse();

    }
}