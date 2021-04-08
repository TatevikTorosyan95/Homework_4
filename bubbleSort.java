public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {1, -8, 98, -48, 6, 1, 1, 23, -758, 5};

        boolean b = true;
        int count = 0;
        while (b) {
            b = false;
            for (int i = 0; i < a.length - 1 - count; i++) {
                if (a[i] < a[i + 1]) {
                    int z = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = z;
                    b = true;
                }
            }
            count++;
        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
