package Lecture;
import java.util.*;

public class ch12_CollectionEx4 {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("한국외국어대학교");
        stack.push("HUFS");
        stack.push("Hello");
        stack.push("HUFS!");

        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
