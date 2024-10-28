package se_parmida_adventure_model;

public abstract class Creature {
    public int health;
    public int damage;
    public String name;

    public Creature(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public void takeDamage (int damage){
        health -= damage;
    }

    public void attack (Creature toAttack){
        toAttack.takeDamage(this.damage);
    }

    public boolean isAlive(){
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }


}
