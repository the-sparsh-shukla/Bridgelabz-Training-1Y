public class NullPointerDemo {

    static void generate() {
        String s = null;
        System.out.println(s.length()); 
    }

    static void handle() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {
       
        handle();
    }
}
