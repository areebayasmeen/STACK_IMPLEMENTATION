

public class Stack1 {

//stack using array
    int size=10;
    int[] array=new int[size];
    int sizeOfStack=-1;
    void push(int data){
        if(sizeOfStack==size-1){
            System.out.println("stack full");
            return;
        }
        sizeOfStack++;
        array[sizeOfStack]=data;
    }
    void display(){
        if(sizeOfStack==-1){
            System.out.println("stack empty cannot display");
            return;
        }
        for(int i=0;i<=sizeOfStack;i++){
            System.out.println(array[i]);
        }
    }
    int pop(){
        if(sizeOfStack==-1){
            System.out.println("stack empty cannot pop");
            return -1;
        }
        int data=array[sizeOfStack];
        sizeOfStack--;
        return data;
    }
    void peek(){
        if(sizeOfStack==-1){
            System.out.println("stack empty cannot peek");
            return ;
        }
        System.out.println(array[sizeOfStack]);
    }
}
