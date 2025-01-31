public class Exercises1 {
    public long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public long fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    public char[][] generateTriangle(int row) {
        char[][] c = new char[row][];
        for (int i = 0; i < row; i++)
            c[i] = new char[i + 1];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                c[i][j] = '*';
            }
        }
        return c;
    }

    public static void main(String[] args) {

    }
}
