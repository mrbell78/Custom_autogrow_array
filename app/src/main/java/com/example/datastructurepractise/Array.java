package com.example.datastructurepractise;

public class Array {
    private int count;
    private int []items;
    public Array(int length) {
        this.items = new int [length];
    }




    public void insert(int value){
        //if array is full , resize it
        if(items.length==count){
            int newarry[] = new int[count*2];

            for(int i=0;i<count;i++){
                newarry[i]=items[i];
            }

            items=newarry;
        }
        // add new item in the end
        items[count++]=value;
    }

    public void removeAt(int index) throws IllegalAccessException {
        if(index<0 || index>=count){
            throw new IllegalAccessException();
        }

        for(int i=0;i<count;i++){
            items[i]=items[i+1];
            count--;
        }


    }
    public void print(){
        for(int i =0;i<count;i++){
            System.out.println("the array is ....."+items[i]);
        }
    }
}
