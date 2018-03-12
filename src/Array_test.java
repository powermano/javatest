import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_test {
    public static void main(String[] args)
    {
        int[] test= {6,3,1,2,4,5,7};
        Arrays.sort(test);
        for(int i : test)
        {
            System.out.println(i);
        }
        String str = "helloworld";
        char[] data = str.toCharArray();// 将字符串转为数组
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + "  ");
            data[x] -= 32;
            System.out.print(data[x] + "  ");
        }
        System.out.println(new String(data)); // creata a new object : 使用构造方法来创建string对象 : Stringa = new String(data) or String[] a = new String[size]
        System.out.println(str.charAt(1)); // index starts at 0

    }
}
