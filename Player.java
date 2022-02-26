import java.util.*;
public class Player
{
    public int potions;
    public Item armor;
    public Item  weapon;
    public int[] stats = {2,2,5}; // DEF, ATK, Health
    public Player()
    {
        potions = 1;
       // armor = new Item(2, "basic", "armor");
    //    weapon = new Item(2, "basic", "weapon");
        
    }
    public void usePot()
    {
        if(potions > 0)
        {
            potions --;
            stats[2] += 2;
            System.out.println("Health increased by 2");
        }
        else
        {
            System.out.println("No Health Potions left");
        }
    }
    public void combat(Enemy e)
    {
        Scanner keyboard = new Scanner(System.in);
        while(e.health > 0 && stats[2] > 0)
        {
            System.out.println("What will you do? 0 for Light Attack. 1 for Heavy Attack. 2 for Block");
            int act = keyboard.nextInt();
            int enemyAct = (int)(Math.random()*3);
            String[] actions = {"Light Attack","Heavy Attack","Block"};
            System.out.println("You use " + actions[act] + " and the enemy uses " + actions[enemyAct]);
            if(act == enemyAct)
            {
                System.out.println("You both used the same move and don't lose any health");
            }
            else if(enemyAct + 1 == act || enemyAct - 2 == act)
            {
                System.out.println("The enemy wins and you lose " + e.damage + " health");
                stats[2] -= e.damage;
                System.out.println("You have " + stats[2] + " health left");
            }
            else
            {
                System.out.println("The you win and the enemy loses " + stats[1] + " health");
                e.health -= stats[1];
                System.out.println("the enemy has " + e.health + " health left");
            }
        }
        if(e.health <= 0)
        {
            System.out.println("You have defeated the enemy and got a potion");
            potions++;
        }
        else
        {
            System.out.println("You have been defeated. Better luck next time.");
            throw new IllegalArgumentException("You have failed HAHAHAHAHAHAHAHAHAH"); //LOL
        }
    }   
}
