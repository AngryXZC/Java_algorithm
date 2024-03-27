package imook_algorithm.data_structure.array_stack;

/**
 * @author xzc
 * @date 2024/3/27 16 24:24
 * @description
 */
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
