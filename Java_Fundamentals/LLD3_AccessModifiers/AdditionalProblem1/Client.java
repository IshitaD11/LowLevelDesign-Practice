package LowLevelDesign.Java_Fundamentals.LLD3_AccessModifiers.AdditionalProblem1;

import java.util.Iterator;
import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        // Make a call to display method as per question requirements here
        display(st);

        display(st.iterator());

    }

    // Write the display method as per requirements of question here
    public static void display(Iterable<?> stk){
        Iterator<?> itr = stk.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void display(Iterator<?> itr){
            // Iterator itr = stk.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
}
