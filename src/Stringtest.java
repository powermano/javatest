public class Stringtest {
    public static void main(String[] args)
    {
        String test = "abcf1234";
        System.out.println(test.toString());
        String s1 = " hello";
        String s2 = s1.substring(2,3);
        String s3 = s1.toString();
        String s4 = new StringBuffer(s1).toString();
        String s5 = " hello";
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s2 == s4);
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
    }
}
