import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Weapon[] weapon = new Weapon[5];
        weapon[0] = new Automachine();
        weapon[1] = new Pistol();
        weapon[2] = new RPG();
        weapon[3] = new Slingshot();
        weapon[4] = new WaterPistol();
        System.out.format("У игрока %d слотов с оружием,"
                        + "введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        while(true){
            slot = Integer.parseInt(scanner.nextLine());
            if(slot == (-1)){
                break;
            }else if(slot <= (-2)){
                System.out.println("Повторите ввод");
            } else{
                player.shotWithWeapon(slot - 1);
            }
        }
        System.out.println("Game over!");
    }
}