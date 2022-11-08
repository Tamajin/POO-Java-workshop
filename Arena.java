public class Arena {
    public static void main(String[] args) {
        Monster Vador = new Monster("Vador", 20, 130);
        Monster Luke = new Monster("Luke", 20, 130);

        while (Vador.getLife() > 0) {
            Luke.attack(Vador);
        }
    }
}