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
        if (head == null) {
            return false;
        }
        if (o == head.getContents()){
            head = head.next;
            return true;
        }
        myNode<L> remove = head;
        while (remove.next != null) {
            if (remove.next.getContents().equals(o)) {
                remove.next = remove.next.next;
                return true;
            }
            remove = remove.next;
        }
        return false;
    }

    public boolean edit(L oldContent, L newContent){
        while (head != null){
            if(oldContent.equals(head.getContents())){
                head.setContents(newContent);
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

