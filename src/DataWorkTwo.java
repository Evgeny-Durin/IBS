public class DataWorkTwo {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean gotOne = str.contains("Java");
        boolean gotTwo = str.startsWith("I like");
        boolean gotThree = str.endsWith("!!!");
        if (gotOne & gotTwo & gotThree) {
            String strUpper = str.toUpperCase();
            System.out.println(strUpper);
        }
        String strReplace = str.replace("a", "o");
        System.out.println(strReplace.substring(7, 11));
    }
}
