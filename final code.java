import java.util.Scanner;

public class Main {
    public long fac(int n) {
        if (n == 1)
            return 1;
        else
            return n * fac(n - 1);
    }

    public long fib(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return (fib(n - 1) + fib (n - 2));
    }

    public char[][] generateTriangle(int row) {
        char[][] c = new char[row][];
        for (int i = 0; i < row; i++)
            c[i] = new char[i + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                c[i][j] = '*';
            }
        }
        return c;
    }

    public static void main(String[] args) {
        
    }
}