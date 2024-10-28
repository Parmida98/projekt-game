package se_parmida_adventure_model;

public class Main {
    private static Player player;
    private static Monster monster;

    public static void main(String[] args) {
        player = new Player(500, 40, "Player1");
        monster = new Monster(500, 40, "Monster");
        executeAttack(player, monster);
        System.out.println(monster.getHealth());
    }
    static void executeAttack (Creature attacker, Creature defender){
        attacker.attack(defender);
        System.out.println(attacker.getName() + " is attacking " + defender.getName());
        if (defender.isAlive()){
            System.out.println(defender.getName() + "`s health remain: " + defender.getHealth());
        }
        else {
            System.out.println(defender.getName() + " : has died:");
        }

       private static void fightOneRound() {
            executeAttack(player, monster);

            if (defender.isAlive()){
                executeAttack(monster, player);
            }
        }




    }
}
