import java.util.*;

public class Main{
    public static void main(String args){
        Human h1 = new Human("name", 100);//名前,hpを初期変数
        Enemy e1 = new Enemy("name", 100);//名前,hpを初期変数

        Human.equipAttack(new NormalAttack());//技を持たせる
        Human.equipAttack(new RandomAttack());//技を持たせる

        Enemy.equipAttack(new MultiplesOf3Attack());//技を持たせる

        while(true) {
            h1.showAttackMenu();

            //攻撃技を選択する
            while(true){
                Scanner sc = new Scanner(System.in);
                int attacknum = sc.nextInt();
                if (attacknum <= 0 || attacknum > h1.attackCounter()) {
                    System.out.println("1から"+ h1.attackCounter()  
                        + "までの数字を入力してください");
                    continue;
                }
                break;
            }
            //入力された攻撃番号で攻撃
            h1.attack(attacknum);
            if (e1.getHp() <= 0) {
                System.out.println("GAME CLEAR");
            }
            e1.attack(1);
            if (h1.getHp() <= 0) {
                System.out.println("GAME OVER");
            }

        }


    }
}