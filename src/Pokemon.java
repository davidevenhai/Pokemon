import java.util.Random;

public abstract class Pokemon {
    private int hp;
    private int maxHp;
    private int attackPoints;
    private int minDamage;
    private int maxDamage;
    private int level;
    private String[] attacks;


    public int kick(){
        return 2;
    }

    public Pokemon() {
        this.attacks = new String[]{"Kick"};
    }

    public String[] getStringArray(){

        return this.attacks;
    }

    public int randomRange(int high, int low) {
        Random number = new Random();
        int result = number.nextInt(high - low) + low;
        return result;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String[] getAttacks() {
        return attacks;
    }

    public void setAttacks(String[] attacks) {
        this.attacks = attacks;
    }
}
