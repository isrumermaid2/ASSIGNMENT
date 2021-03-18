
package mydynamicstack;

import java.util.Scanner;

public class MyDynamicStack {
     
    private int stackSize;
    private int[] stackArr;
    private int top;
 
    public MyDynamicStack(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }
 
    public void push(int entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }
 
    public int pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        int entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }

    public long peek() {
        return stackArr[top];
    }
 
    private void increaseStackCapacity(){
         
        int[] newStack = new int[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
 
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter the initial size for the stack: ");
        int stackSize = myObj.nextInt();
        MyDynamicStack stack = new MyDynamicStack(stackSize);
        for(int k = 1; k > 0; k++) {
            System.out.println("\nPress 1 to push in to the stack\nPress 2 to pop from the stack\nPress any other key to quit");
            int stackOperation = myObj.nextInt();
            
            if (stackOperation == 1) {
                System.out.println("\nHow many elements do you want to push in to the stack : ");
                int pushAmount = myObj.nextInt();
                for (int i = 0; i < pushAmount; i++) {
                    System.out.println("\nEnter the number to push in to the stack : ");
                    int ele = myObj.nextInt();
                    stack.push(ele);
                }
            } else if (stackOperation == 2) {
                try {
                    stack.pop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("\nSorry we don't have that choice here.");
                System.exit(1);
            }
        }
    }
}



