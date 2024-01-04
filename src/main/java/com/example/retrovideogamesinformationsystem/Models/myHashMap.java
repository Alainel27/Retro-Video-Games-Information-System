/**
package com.example.retrovideogamesinformationsystem.Models;

public class myHashMap<H> {

    myLinkedList<H>[] hashTable;

   public int hashFunction(int key) {
        return key%hashTable.length;
   }

    public String displayHashTable() {
        for (myLinkedList<H> hmyLinkedList : hashTable) {
           return hmyLinkedList.display();
        }
        return null;
    }

    public int add(H data){
        int loc = hashFunction(Math.abs(data.hashCode()));
        hashTable[loc].add(data);
        return loc;
    }

    public int add(int key,H data){
        int loc = hashFunction(key);
        hashTable[loc].add(data);
        return loc;
    }

    public void remove(int key){
        int loc = hashFunction(key);

        if (hashTable[loc] != null){
            myLinkedList<H> linkedList = hashTable[loc];
            linkedList.remove(loc);
        }
    }
 }
 */
