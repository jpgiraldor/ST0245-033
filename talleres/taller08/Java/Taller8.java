import java.util.*;

/**
 *
 * @author
 */
public class Taller8 {

    //Punto 1
    public static Stack<Integer> inversa (Stack<Integer> stack){
        Stack newStack = new Stack();

        while (!stack.empty()) {
            newStack.push(stack.pop());
        }
        return newStack;
    }


    //Punto 2
    public static void cola (Queue<String> queue){

        Iterator<String> it = queue.iterator();

        while (it.hasNext()) {
            System.out.println("Atendiendo a: " + it.next());
        }

    }


    //notacion polaca
    public static int polaca(String string){

        String [] fila = string.split(" ");

        if (fila[fila.length-1].charAt(0) >= 48 && fila[fila.length-1].charAt(0) <= 57) {
            return Integer.parseInt(fila[fila.length-1]);
        }

        Integer result = null;
        Integer oper = null;

        for (String o : fila) {

            if (o.equals("+")){

                result += oper;

                oper = null;

            }else if (o.equals("-")){

                result -= oper;

                oper = null;

            }else if (o.equals("*")){

                result *= oper;

                oper = null;

            }else if (o.equals("/")){

                result /= oper;

                oper = null;

            }else{

                if (result == null){
                    result = Integer.parseInt(o);
                }else if (oper == null){
                    oper = Integer.parseInt(o);
                }

            }
        }
        System.out.println(result);
        return result;
    }
}