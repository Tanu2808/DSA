
public class SimplifyPath {
    
    public String simplifyPath(String path) {
        Stack stack = new Stack();
        String[] parts = path.split("/");
        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
            
        }
        if (stack.isEmpty()) return "/";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stack.size(); i++) {
            result.append("/").append(stack.get(i));
        }

        return result.toString();
    }
}

class Stack {
    private String[] arr;
    private int top;
    private int capacity;

    public Stack()
    {
        capacity = 2;
        arr = new String[capacity];
        top = -1;
    }

    private void resize() {
        capacity *= 2;

        String[] newArr = new String[capacity];

        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    public void push(String x) {
        if (top == capacity - 1) {
            resize();
        }

        arr[++top] = x;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return arr[top--];
    }

    public String get(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException();
        }

        return arr[index];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
