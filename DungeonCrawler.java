import java.util.*;
import java.util.concurrent.TimeUnit;
public class DungeonCrawler
{
    public static void main (String [] args)
    {
        
        System.out.println("The year is 2073");
        
        System.out.println("You are in a spaceship traveling to the distant galaxy of NGC-3048");
        
        System.out.println("A large meteor crashes into the right side of the ship");
        
        System.out.println("The badly damaged ship crashes into the planet Xghrgd");
        
        System.out.println("Your only way to escape the hostile aliens is to reach the rocket launch site");
        
        System.out.println("As you crawl out the spacehsip you see an alien with a saber approaching you... ");
        
        System.out.println("LEVEL 1 - CRASH SITE");
        
        
        for(char[] list : board.level1)
        {
            for(char c : list)
            {
                System.out.print(c);
            }
             System.out.println();
        }
        System.out.println("# is the player\n! is the enemy\n$ is where the player needs to reach\n? is a chest");
        
    }   
}
