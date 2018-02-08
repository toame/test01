public class Main{
        int a = sc.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + "は素数ではありません");
                return;
            }
        }
        System.out.println(a + "は素数です");

    }
}