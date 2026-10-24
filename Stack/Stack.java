package Stack;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack()
    {
        capacity = 2;
        arr = new int[capacity];
        top = -1;
    }

    private void resize() {
        capacity *= 2;

        int[] newArr = new int[capacity];

        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            resize();
        }

        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }

        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }

        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
