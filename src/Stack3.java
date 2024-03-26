
import java.util.LinkedList;

public class Stack3<T> {
    //stack using linked list

LinkedList<T> linkedList=new LinkedList<T>();
int sizeOFStack=-1;
void push(T data){
    linkedList.addFirst(data);
    sizeOFStack++;

}

T pop(){
    if(sizeOFStack==-1){
        System.out.println("stack is empty cannot pop");
        return null;
    }
    sizeOFStack--;
    return linkedList.removeFirst();

}
void display(){
    if(sizeOFStack==-1){
        System.out.println("stack is empty cannot dsiplay");
        return;
    }
        System.out.println("Stack:");
        for (T item : linkedList) {
            System.out.println(item);
        }
    }
    void peek(){
    if(sizeOFStack==-1){
        System.out.println("stack is empty cannot peek");
        return;
    }
        System.out.println(linkedList.peek());
    }
}

