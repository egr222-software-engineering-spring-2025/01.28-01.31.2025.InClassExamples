public class Stars {
    public static void main(String[] args) {
        line('*',13);
        line('.',7);
        line('-',35);
        box('*',10,3);
        box('*',5,4);
    }

    public static void line(char c, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    private static void box(char c, int width, int height) {
        line(c, width);
        for (int j = 1; j <= height-2; j++) {
            System.out.print(c);
            for (int i = 1; i <= width-2; i++) {
                System.out.print(" ");
            }
            System.out.println(c);
        }
        line(c, width);
    }
}