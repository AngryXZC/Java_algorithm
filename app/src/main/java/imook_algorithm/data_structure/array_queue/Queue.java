package imook_algorithm.data_structure.array_queue;

/**
 * @author xzc
 * @date 2024/3/29 14 48:32
 * @description
 */
public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
