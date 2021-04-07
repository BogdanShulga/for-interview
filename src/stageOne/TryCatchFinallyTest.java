package stageOne;

public class TryCatchFinallyTest {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new Error();
        } catch (Exception exception) {
            System.out.println("B");
//            System.out.println(exception.getMessage());
        } catch (Throwable throwable) {
            System.out.println("C");
//            System.out.println(throwable.getMessage());
        } finally {
            System.out.println("D");
        }
    }
}
