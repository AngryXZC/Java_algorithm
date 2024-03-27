package imook_algorithm.data_structure.array_stack;

/**
 * @author xzc
 * @date 2024/3/27 16 29:27
 * @description
 */
public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();

        for(int i = 0 ; i < 5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
