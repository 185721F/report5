package jp.ac.uryukyu.ie.e185721;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.attack = attack;
        this.hitPoint = hitPoint;

        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        if(dead == false) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    public int getdamege(int damage){
        hitPoint -= damage;
        return hitPoint;
    }
}