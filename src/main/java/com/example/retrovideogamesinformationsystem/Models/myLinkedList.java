package com.example.retrovideogamesinformationsystem.Models;

public class myLinkedList<L> {
    public myNode<L> head = null;
    private int size;

    public int size(){
        return size;
    }

    //Adds a new item to the beginning of the list and increases the size
    public void add(L N) {
        myNode<L> add = new myNode<>();
        add.setContents(N);
        add.next = head;
        head = add;
        size ++;
    }

    //Gets the contents of the index in the list
    public L get(int index) {

        myNode<L> current = head;
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current.getContents();
            }
            current = current.getNext();
            currentIndex++;
        }
        return null;
    }

    //Sets the index selected to new contents
    public void set(int index, L newContents){

        myNode<L> current= head;
        int currentIndex = 0;

        while (current != null){
            if (currentIndex == index){
                current.setContents(newContents);
                return;
            }
            current = current.getNext();
            currentIndex++;
        }
    }


    //Displays the contents of the list
    public String display(){
        String list = "";
        myNode<L> h = head;
        while (h != null){
            list += h.getContents() + "\n";
            h = h.next;
        }
        return list;
    }

    //Remove the first occurrence of the given object of the list and decreases the size
    public void remove(Object o) {
        if (head == null) {
            return;
        }
        if (o == head.getContents()){
            head = head.next;
            return;
        }
        myNode<L> remove = head;
        while (remove.next != null) {
            if (remove.next.getContents().equals(o)) {
                remove.next = remove.next.next;
                return;
            }
            remove = remove.next;
            size--;
        }
    }
}

