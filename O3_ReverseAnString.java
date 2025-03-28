package ABCTech;

import java.util.Arrays;

public class O3_ReverseAnString {
    public static void main(String[] args) {

        String s = "Akilan";
        int size = s.length();
        char x[] = s.toCharArray();
        char y[] = new char[x.length];
        int i = 0;

        while (i != size) {
            y[size - 1 - i] = x[i];
            i++;
        }
        System.out.print("Given String :");
        System.out.println(x);
        System.out.print("Naive Approach :");
        System.out.println(y);


        /* *********************************************************** */

        StringBuilder sb = new StringBuilder();

        for (int j = s.length() - 1; j >= 0; j--) {
            sb.append(s.charAt(j));
        }

        System.out.println("Better :" + sb);

        /* *********************************************************** */

        int l = 0;
        int r = x.length - 1;
        while(l < r){
            char temp = x[l];
            x[l] = x[r];
            x[r] = temp;
            l++;
            r--;
        }

        System.out.println("Optimal :" + new String(x));
        System.out.println("My char arr:" + Arrays.toString(x));
    }
}
