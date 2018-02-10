import java.util.*;

public class Main{
    public static void main(String args){
        Human h1 = new Human("name", 100);//–¼‘O,hp‚ğ‰Šú•Ï”
        Enemy e1 = new Enemy("name", 100);//–¼‘O,hp‚ğ‰Šú•Ï”

        Human.equipAttack(new NormalAttack());//‹Z‚ğ‚½‚¹‚é
        Human.equipAttack(new RandomAttack());//‹Z‚ğ‚½‚¹‚é

        Enemy.equipAttack(new MultiplesOf3Attack());//‹Z‚ğ‚½‚¹‚é

        while(true) {
            h1.showAttackMenu();

            //UŒ‚‹Z‚ğ‘I‘ğ‚·‚é
            while(true){
                Scanner sc = new Scanner(System.in);
                int attacknum = sc.nextInt();
                if (attacknum <= 0 || attacknum > h1.attackCounter()) {
                    System.out.println("1‚©‚ç"+ h1.attackCounter()  
                        + "‚Ü‚Å‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
                    continue;
                }
                break;
            }
            //“ü—Í‚³‚ê‚½UŒ‚”Ô†‚ÅUŒ‚
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