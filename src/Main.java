public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.weapon.setWeaponType(WeaponType.Cold);
        boss.weapon.setWeaponName("Knife");
        boss.setHealth(500);
        boss.setDamage(60);

        System.out.println(boss.printInfo());


        Skeleton skeleton1 = new Skeleton();
        skeleton1.weapon.setWeaponType(WeaponType.Firearms);
        skeleton1.weapon.setWeaponName("Gun");
        skeleton1.setHealth(600);
        skeleton1.setDamage(40);
        skeleton1.setNumberOfArrows(3);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.weapon.setWeaponType(WeaponType.Chemical);
        skeleton2.weapon.setWeaponName("Poisonous");
        skeleton2.setHealth(800);
        skeleton2.setDamage(70);
        skeleton2.setNumberOfArrows(6);


        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());








    }
}