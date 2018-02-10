import java.util.*;

public class Main{
    public static void main(String args){
        Human h1 = new Human("name", 100);//���O,hp�������ϐ�
        Enemy e1 = new Enemy("name", 100);//���O,hp�������ϐ�

        Human.equipAttack(new NormalAttack());//�Z����������
        Human.equipAttack(new RandomAttack());//�Z����������

        Enemy.equipAttack(new MultiplesOf3Attack());//�Z����������

        while(true) {
            h1.showAttackMenu();

            //�U���Z��I������
            while(true){
                Scanner sc = new Scanner(System.in);
                int attacknum = sc.nextInt();
                if (attacknum <= 0 || attacknum > h1.attackCounter()) {
                    System.out.println("1����"+ h1.attackCounter()  
                        + "�܂ł̐�������͂��Ă�������");
                    continue;
                }
                break;
            }
            //���͂��ꂽ�U���ԍ��ōU��
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