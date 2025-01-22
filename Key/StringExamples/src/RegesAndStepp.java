public class RegesAndStepp {
    public static void main(String[] args) {
        // index     012345678901
        String s1 = "Stuart Reges";
        String s2 = "Marty Stepp";

        System.out.println(s1.length());         // 12
        System.out.println(s1.indexOf("e"));     // 8
        System.out.println(s1.substring(7, 10)); // "Reg“

        String s3 = s2.substring(1, 7);
        System.out.println(s3.toLowerCase());    // "arty s"
    }
}
