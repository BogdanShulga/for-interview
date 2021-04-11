package stageOne;

public class StringIntegerCastTest {
    public static void main(String[] args) {
        String a = "25";
        String b = "75";
        String c = a + b;
        System.out.println("c = " + c);
        int k = Integer.parseInt(a + b);
        System.out.println("k = " + k);
    }
}
