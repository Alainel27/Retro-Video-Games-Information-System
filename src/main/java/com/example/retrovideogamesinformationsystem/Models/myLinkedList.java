package com.example.retrovideogamesinformationsystem.Models;

public class myLinkedList<L> {

    private myNode<L> head = null;

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
}

