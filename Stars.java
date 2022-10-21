public class Stars {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++) {
            System.out.println(" ".repeat(20-i) + "\u203b".repeat(i));
        }
    }
}
