package secondary;

public class Monster {
    private String name;
    private int attackDamage;
    private int health;

    public Monster(String name, int attackDamage, int health) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void displayInfo() {
        System.out.println("Monster: " + name);
        System.out.println("Attack Damage: " + attackDamage);
        System.out.println("Health: " + health);
    }
}
