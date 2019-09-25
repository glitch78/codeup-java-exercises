import java.util.Scanner;

public class userGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       // Player attributes
        int heroHealth = 100;
        int heroArmor = 25;
        int heroAttack = 10;
        int heroPotion = 5;

        // CPU attributes
        int villainHealth = 100;
        int villainArmor = 25;
        int villainAttack = 10;


        System.out.println("Are you ready to start the game? yes or no");
        String userResponse = sc.nextLine();

        if(userResponse.equalsIgnoreCase("yes")){
            System.out.println("Cool, let's play.  What's your name");
            String userName = sc.nextLine();
        } else {
            System.out.println("Ok, your loss");
        }
        while (heroHealth > 0 && villainHealth > 0){
            System.out.println(" hero health: "  + heroHealth + " armor: " + heroArmor + " potions: "+ heroPotion);
            System.out.println(" villain health: "  + villainHealth + " armor: " + villainArmor);
            System.out.println("attack, drink potion, run");
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("attack") ){
               int[] updatedVillainStats = attack(villainHealth, villainArmor, heroAttack);

               villainHealth = updatedVillainStats[0];
               villainArmor = updatedVillainStats[1];
            }else if(choice.equalsIgnoreCase("potion")){
               int [] updatedHeroStats = drinkPotion(heroPotion, heroHealth);
               heroHealth = updatedHeroStats[0];
               heroPotion = updatedHeroStats[1];
            }else if(choice.equalsIgnoreCase("run")){
                 heroHealth = 0;
            }else {
                continue;
            }

            int[] updatedVillainStats = attack(heroHealth, heroArmor, villainAttack);
            heroHealth = updatedVillainStats[0];
            heroArmor = updatedVillainStats[1];

        } if(heroHealth <= 0){
            System.out.println("The villain won!");
        }else {
            System.out.println("You won!");
        }
    }

    public static int[] attack(int health, int armor, int maxDamage ){
        // Health and armor is going to equal opposition health and armor.
        // Attack points is going to be whoever is attacking.

        int hit = (int) Math.floor((int) Math.random() * maxDamage);

        if(armor >= hit){
            armor = armor - hit;
        } else {
            health -= (hit - armor);
            armor = 0;
        }

        return new int[]{health, armor};
    }
    public static  int[] drinkPotion(int potion, int health) {

        if (health < 20 && potion > 0) {
            health += 15;
            potion -= 1;
        }
        return new int[] {health, potion};
    }
}
