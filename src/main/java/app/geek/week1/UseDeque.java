package app.geek.week1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zhouze
 * @date 2021/1/31
 */
public class UseDeque {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        System.out.println(deque);

        String last = deque.peekLast();
        System.out.println(last);
        System.out.println(deque);

        while (deque.peekLast() != null) {
            System.out.println(deque.pop());
        }
        System.out.println(deque);
    }
}
