package ABCTech;

public class O2_CopyStringToAnother {
    public static void main(String[] args) {
        String s = "Akilan";

        char[] x = s.toCharArray();
        int size = s.length();
        char[] y = new char[size];

        for (int i = 0; i < size; i++) {
            y[i] = x[i];
        }

        System.out.println(x);
        System.out.println();
        System.out.println(y);

        String str1 = "Hello";
        String str2 = new String(str1);  // Copying the string
    }
}
