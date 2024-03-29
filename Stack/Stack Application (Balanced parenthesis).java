import java.util.Scanner;

public class Main {
    int top = -1;
    int maxSize;
    char[] stack;

    public Main(int n) {
        maxSize = n;
        stack = new char[maxSize];
    }

    public void push(char ch) {
        if (top == maxSize) {
            System.out.println("Stack overflow");
            return;
        } else
            top++;
        stack[top] = ch;
    }

    public int pop(char ch) {
        if (top == -1) {
            System.out.println("stack underflow");
            return -1;
        } else {
            if (stack[top] == '[' && ch == ']' || stack[top] == '{' && ch == '}' || stack[top] == '(' && ch == ')') {
                top--;
                return 1;
            } else
                return 0;
        }
    }

    public static void main(String[] args) {
        int i, len, pushVar = 0, popVar = 0;

        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Enter the expression ");
        str = in.nextLine();
        len = str.length();
        Main obj = new Main(len);
        for (i = 0; i < len; i++) {
            if (str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
                obj.push(str.charAt(i));
                pushVar++;
            }
        }
        for (i = 0; i < len; i++) {
            if (str.charAt(i) == ']' || str.charAt(i) == '}' || str.charAt(i) == ')') {
                popVar += obj.pop(str.charAt(i));
            }
        }

        if (pushVar == popVar)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}