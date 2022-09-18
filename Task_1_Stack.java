//Взять за основу реализацию стека, написанную в конце семенара. Добавить проверку граничных условий и выводить сообщения об ошибках, 
//если мы пытаемся извлечь элемент из пустого стека, добавить элемент в полностью заполненный стек и тд
public class Task_1_Stack<T> {
    private T[] array;
    private int index;

    public Task_1_Stack(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
         return this.index;
    }

    public boolean empty() {
        return this.size() == 0;
    }

    public void push(T value) {
        try {
            this.array[index++] = value;
        } catch (Exception e) {
            System.out.println("Error! Stact overflow!");
        }
    }

    public T peek() {
        if (!this.empty()) {
            return this.array[index - 1];
        } else {
            System.out.println("Error! Stact is empty!");
            return null;
        }
    }

    public T pop() {
        if (!this.empty()) {
            return this.array[--index];
        } else {
            System.out.println("Error! Stact is empty!");
            return null;
        }
    }

    public static void main(String[] args) {
        Task_1_Stack<String> stack = new Task_1_Stack<>(4);
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        stack.push("String 4");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}