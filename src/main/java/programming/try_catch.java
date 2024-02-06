package programming;

public class try_catch {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        try {
            j = j/i;

        } catch (Exception e) {
            System.out.println("Something weent wrong");
        }
        System.out.println(j);
        System.out.println("TATA");

    }
}