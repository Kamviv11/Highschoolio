import java.util.*;
public class DungeonCrawler
{
    private static Player p = new Player();
    private static int level = 1;
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
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
        while(true)
        {
            System.out.println("Where do you want to move? 1 for up, 2 for down, 3 for left, 4 for right. Type 5 to use a potion");
            if(move(keyboard.nextInt(), board.level1)) break;
        }
        
        

    }
    public static boolean move(int m, char[][] a)
    {
        int[] b = findPlayer(a);
        if(m == 1)
        {
            if(a[ b[0] ][ b[1] + 1] == " ")
            {
                a[b[0]][b[1]] =  ' ';
                a[b[0]][b[1]+1] = '#';
            }
            else if(a[ b[0] ][ b[1] + 1] == "!")
            {
                p.combat( new Enemy(level) );
            }
            else if(a[ b[0] ][ b[1] + 1] == "?")
            {
                if((int)(Math.random()*2)==1)
                {
                    p.stats[0]++;
                    System.out.println("You got better armor and a potion");
                }
                else{
                    p.stats[1]++;
                    System.out.println("You got better attack power and a potion");
                }
                p.potions++;
                a[b[0]][b[1]] =  ' ';
                a[b[0]][b[1]+1] = '#';
            }
            else if (a[ b[0] ][ b[1] + 1] == "?")
            {
                System.out.println("You have finished level " + level);
                level++;
                return true;
            }
            else
            {
                System.out.println("There is a Wall in the way");
            }
            return false;
        }
    }
    public static int[] findPlayer(char[][] arr)
    {
        int[] a = new int[2];
        for(int r = 0; r < arr.length; r++)
        {
            for(int c = 0; c < arr[r].length; c++)
            {
                if(arr[r][c] == '#')
                {
                    a[0] = r;
                    a[1] = c;
                }
            }
        }
        return a;
    }
}
