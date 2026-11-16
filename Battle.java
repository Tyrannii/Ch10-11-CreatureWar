
import java.util.ArrayList;

/**
 * Battle manages two armies of creatures.
 * Each army contains different types of creatures.
 */
public class Battle
{
    private ArrayList<Creature> goodArmy;
    private ArrayList<Creature> evilArmy;

    /**
     * Create the two armies.
     */
    public Battle()
    {
        goodArmy = new ArrayList<Creature>();
        evilArmy = new ArrayList<Creature>();

        createArmies();
    }

    /**
     * Populate both armies with random creatures.
     */
    public void createArmies()
    {
        goodArmy.clear();
        evilArmy.clear();

        // Create 100 good creatures.
        for (int i = 0; i < 100; i++)
        {
            int choice = Randomizer.nextInt(10);

            if (choice <= 6)
            {
                goodArmy.add(new Human());
            }
            else
            {
                goodArmy.add(new Elf());
            }
        }

        // Create 40 evil creatures.
        for (int i = 0; i < 40; i++)
        {
            int choice = Randomizer.nextInt(25);

            if (choice <= 18)
            {
                evilArmy.add(new Human());
            }
            else if (choice <= 24)
            {
                evilArmy.add(new CyberDemon());
            }
            else
            {
                evilArmy.add(new Balrog());
            }
        }
    }
    

    /**
     * Simulate a battle until one or both armies
     * have no creatures remaining.
     */
    public void startBattle()
    {
        System.out.println("The battle begins!");

        while (!goodArmy.isEmpty() && !evilArmy.isEmpty())
        {
            Creature good = goodArmy.get(0);
            Creature evil = evilArmy.get(0);

            // Continue fighting while both creatures are alive.
            while (good.isAlive() && evil.isAlive())
            {
                // Both attacks are calculated before damage.
                int goodDamage = good.attack();
                int evilDamage = evil.attack();

                good.takeDamage(evilDamage);
                evil.takeDamage(goodDamage);
            }

            // Remove defeated creatures from the armies.
            if (good.isKnockedOut())
            {
                goodArmy.remove(0);
            }

            if (evil.isKnockedOut())
            {
                evilArmy.remove(0);
            }
        }

        // Report the winning army.
        if (goodArmy.isEmpty() && evilArmy.isEmpty())
        {
            System.out.println("The battle ended in a tie!");
        }
        else if (evilArmy.isEmpty())
        {
            System.out.println("The Good Army wins!");
        }
        else
        {
            System.out.println("The Evil Army wins!");
        }

        System.out.println("Good Army survivors: "
            + goodArmy.size());
        System.out.println("Evil Army survivors: "
            + evilArmy.size());
    }

}
