package com.zss.src2;

/**
 * @ClassName: StackDemo
 * @Author: 邹双双
 * Date: 2020/6/8 13:57
 * @Description:
 */
public class StackDemo {
    private int[] array = new int[100];
    private int size = 0;

    //入栈
    public  void push(int elem){
        array[size] = elem;
        size++;
    }

    //出栈
    public int pop(){
        int ret = array[size-1];
        size--;
        return ret;
    }

    //取栈顶元素
    public int pick(){
        return array[size-1];
    }
    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        stackDemo.push(1);
        stackDemo.push(2);

    }
}
