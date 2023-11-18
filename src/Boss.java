public class Boss extends GameEntity {
     Weapon bossWeapon;

     Weapon weapon = new Weapon();

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public  String printInfo(){
        return "HEALTH: " + getHealth() + " DAMAGE: " + getDamage() +
                " TYPE OF WEAPON: " + weapon.getWeaponType() +
                " WEAPON: " + weapon.getWeaponName();
    }



}
