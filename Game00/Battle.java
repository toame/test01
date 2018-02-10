public class Battle {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Human h1 = new Human(100);//HP
        Enemy e1 = new EnemyB(100);//HP

        while(true) {
            if (h1.getHp() <= 0) {
                System.out.println("GAME OVER");
                return;
            }
            System.out.println("HP:" + h1.getHp() + "  “GHP:" + e1.getHp());
            h1.menu();//‹Z‘I‘ð‚Ì2‚Â‚ð•\Ž¦‚³‚¹‚é‚¾‚¯.
            int command;
            while(true){
                sc = new java.util.Scanner(System.in);
                try{
                command = sc.nextInt();
                }catch(java.util.InputMismatchException e){
                System.out.println("‚P‚©‚Q‚©‚ð‘I‘ð‚µ‚Ä‚­‚¾‚³‚¢");
                continue;
                }
                if (command != 1 && command != 2) {
                    System.out.println("‚P‚©‚Q‚©‚ð‘I‘ð‚µ‚Ä‚­‚¾‚³‚¢");
                    continue;      
                }
                break;
            }
            h1.attack(command, en);
            if (command == 2) {
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){}
            }
            if (e1.getHp() <= 0) {
                System.out.println("GAME CLEAR");
                return;
            }
            e1.attack(h);
            
        }
    }
}