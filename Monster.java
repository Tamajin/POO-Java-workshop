public class Monster {
    private String name;
    private int damage;
    private int life;

    public Monster(String name, int damage, int life) {
        this.name = name;
        this.damage = damage;
        this.life = life;
    };

    public int getDamage() {
        return this.damage;
    };
    public String getName() {
        return this.name;
    };
    public int getLife() {
        return this.life;
    };

    public void setLife(int life) {
        this.life = life;
    };

    public void attack(Monster enemy) {
         enemy.setLife(enemy.life - this.getDamage());
         if (enemy.life > 0) {
            System.out.println(enemy.name + " has " + enemy.life + " remaining");
         } else {
            System.out.println(enemy.name + " is KO");
         }
    };
}