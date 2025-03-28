package ABCTech;

public class O1_ComputeTheLength {
    public static void main(String[] args) {


        String s = "Anna university Regional Campus, Coimbatore";
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            //
        }
        System.out.println(s.length());
        System.out.println(length);
    }
}
