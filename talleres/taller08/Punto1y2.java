import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Punto1y2
{
   public static void main(String [] args) {
       Stack<Integer> stack = new Stack<Integer>();
       stack.push(1);
       stack.push(2);
       stack.push(3);
       
       //System.out.println("Antes de invertir: " + stack);
       //System.out.println("Después de invertir: " + punto1(stack));
       
    }
    
   public static Stack<Integer> punto1(Stack<Integer> stack) {

       int s = stack.size();
       Stack<Integer> stack1 = new Stack<Integer>();
       for(int i = 0; i<s; i++) {
       stack1.push(stack.pop());
      }

      return stack1;
    }
    
    
   public static void punto2() {
       Queue<String> queue = new LinkedList<String>();
       queue.add("Juan");
       queue.add("María");
       queue.add("Pedro");
       
       int s = queue.size();
       for(int i = 0; i < s; i++) {
       System.out.println("Atendiendo a: " + queue.poll());
      }
    }
}