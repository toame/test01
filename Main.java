public class Main{
    public static void main(String args[]){ 
        int a = sc.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + "は素数ではありません.");
                System.out.println(a + "は合成数ってことだ.");
                return;
            }
        }
        System.out.println(a + "は素数です.");
    }
}