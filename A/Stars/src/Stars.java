public class Stars {
    public static void main(String[] args) {
        line("*",13);
        line("*",7);
        line("+",35);
        box(10,3);
        box(5,4);
    }

    public static void line(String s, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    private static void box(int width, int height) {
        for (int i = 1; i <= width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j=1; j<=height; j++) {
            System.out.print("*");
            for (int i = 1; i <= width-2; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}