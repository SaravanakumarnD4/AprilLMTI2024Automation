package interview;


public class ReverseInt {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int c = 0;
        int ch;
        for (int i = 0; i < a.length; i++) {
            ch = c + a[i];
            System.out.println(ch);
        }
    }
}


