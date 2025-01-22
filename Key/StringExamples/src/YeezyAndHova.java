public class YeezyAndHova {
    public static void main(String[] args) {
        String starz = "Yeezy & Hova";
        System.out.println(starz.length());             // 12
        System.out.println(starz.indexOf("ee"));        // 1
        System.out.println(starz.substring(3,5));       // "zy"
        System.out.println(starz.substring(5));         // " & Hova"
        System.out.println(starz.toLowerCase());        // "yeezy & hova"
        System.out.println(starz.toUpperCase());        // "YEEZY & HOVA"

        String starz2 = "Simon and Garfunkel";
        System.out.println(starz2.length());             // 19
        System.out.println(starz2.indexOf("ee"));        // -1
        System.out.println(starz2.substring(3,5));       // "on"
        System.out.println(starz2.substring(5));         // " and Garfunkel"
        System.out.println(starz2.toLowerCase());        // "simon and garfunkel"
        System.out.println(starz2.toUpperCase());        // "SIMON AND GARFUNKEL"
    }
}
