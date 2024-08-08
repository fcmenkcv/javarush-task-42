public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        int n = 0;

        while (n < 10) {
            int m = 0;

            while (m < 20) {
                if (n < 1 || n > 8) {
                    System.out.print("Б");
                } else if (m < 1 || m > 18) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                m++;
            }

            System.out.println();
            n++;
        }
    }
}
