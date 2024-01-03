package com.example.retrovideogamesinformationsystem.Models;

import com.example.retrovideogamesinformationsystem.Controllers.GMController;
import com.example.retrovideogamesinformationsystem.Controllers.SController;

public class myLinkedList<L> {

    public myNode<L> head = null;
    private int size;

    public int size(){
        return size;
    }

    public void add(L N) {
        myNode<L> add = new myNode<>();
        add.setContents(N);
        add.next = head;
        head = add;
        size ++;
    }

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


    public String display(){
        String list = "";
        myNode<L> h = head;
        while (h != null){
            list += h.getContents() + "\n";
            h = h.next;
        }
        return list;
    }

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
            size--;
        }
        return false;
    }
    //search


    //public boolean edit(L oldContent, L newContent){
        //while (head != null){
           // if(oldContent.equals(head.getContents())){
              //  head.setContents(newContent);
              //  return true;
          //  }
           // head = head.next;
      //  }
      //  return false;
   // }
}

