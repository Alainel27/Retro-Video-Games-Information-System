package com.example.retrovideogamesinformationsystem.Models;

public class myNode<L> {

    private L contents;

    public myNode<L> next = null;

    public L getContents(){
        return contents;
    }

    public myNode<L> getNext(){
        return next;
    }

    public void setContents(L contents){
        this.contents = contents;
    }
}
