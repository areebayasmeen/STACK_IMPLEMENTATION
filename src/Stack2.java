import java.util.ArrayList;
import java.util.List;

public class  Stack2<T> {
   //stack using arraylist
   List<T> array=new ArrayList<T>();
   int sizeOFStack=-1;
   void push(T data){
       sizeOFStack++;
       array.add(sizeOFStack, data);
   }
   T pop(){
       if(sizeOFStack==-1){
           System.out.println("stack empty cannot pop");
return null;
       }
       T item= array.get(sizeOFStack);
       sizeOFStack--;
               return item;
   }
void display(){
       if(sizeOFStack==-1){
           System.out.println("stack empty cannot display");
           return;
       }
       for(int i=0;i<=sizeOFStack;i++){
           System.out.println(array.get(i));
       }
}
void peek(){
    if(sizeOFStack==-1){
        System.out.println("stack empty cannot peek");
        return;
    }
    System.out.println(array.get(sizeOFStack));
}

}
