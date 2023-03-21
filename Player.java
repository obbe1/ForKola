public class Player {
    private Weapon[] weaponSlots;

    public Player(){
        weaponSlots = new Weapon[]{ // Снаряжаем нашего игрока
                new Automachine(), new Pistol(), new RPG(), new Slingshot(), new WaterPistol()
        };
    }

    public int getSlotsCount(){
        return weaponSlots.length; // length позволяет узнать, сколько слотов с оружием у игрока
    }

    public void shotWithWeapon(int slot){
        if (slot >= this.getSlotsCount() || slot < 0) {
            System.out.println("Выберите оружие " + (this.getSlotsCount() - 1));
        } else {
            Weapon weapon = weaponSlots[slot]; // получаем оружие из выбранного слота
            weapon.shot(); // Огонь
        }
    }

}