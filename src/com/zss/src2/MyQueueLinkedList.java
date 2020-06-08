package com.zss.src2;

/**
 * @ClassName: MyQueue
 * @Author: 邹双双
 * Date: 2020/6/8 14:32
 * @Description:
 */
public class MyQueueLinkedList {
    static class Node{
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = next;
        }


    }
    private  Node head = null;
    private Node tail = null;
    //入队
    public void offer(int val){
        Node newNode = new Node(val);
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public  Integer poll(){
        if (head == null){
           return null;
        }
        int ret = head.val;
        head = head.next;
        if (head == null){
            tail = null;

        }
        return ret;
    }
    public Integer pick(){
        if (head == null){
            return null;
        }
        return head.val;
    }
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
    public static void main(String[] args) {
        MyQueueLinkedList myQueueLinkedList = new MyQueueLinkedList();
        myQueueLinkedList.offer(1);
        myQueueLinkedList.offer(2);
        myQueueLinkedList.offer(3);
        myQueueLinkedList.display();
        System.out.println();
        System.out.println(myQueueLinkedList.pick());
        System.out.println(myQueueLinkedList.poll());
    }
}
