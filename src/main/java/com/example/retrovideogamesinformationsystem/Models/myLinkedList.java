package com.example.retrovideogamesinformationsystem.Models;

public class myLinkedList<L> {

    public myNode<L> head = null;

    public void add(L N) {
        myNode<L> add = new myNode<>();
        add.setContents(N);
        add.next = head;
        head = add;
    }

    public String display(){
        String list = "";
        myNode<L> h = head;
        while (h != null){
            list += h.getContents() + "\n";
            h = h.next;
        }
        return list;
    }

    //this is your method sean I dunno how works
    public boolean remove(Object o) {
        //if head equal null return false
        if (head == null) {
            return false;
        }

        //if o is equal to the contents of the head return true
        if (o == head.getContents()){
            //go through the linked list
            head = head.next;
            return true;
        }
        //create a temp node at head
        myNode<L> remove = head;
        //while temp node is not null
        while (remove.next != null)
        {

            if (remove.next.getContents().equals(o)) {
                remove.next = remove.next.next;
                return true;
            }
            remove = remove.next;
        }
        return false;
    }



    public boolean edit(L oldC, L newC) {

        while (head != null) {
            if (oldC.equals(head.getContents())) {
                head.setContents(newC);
                return true;
            }
            head = head.next;
        }
        return false;
    }


}

