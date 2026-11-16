
/**
 * The base class for all battling creatures.
 *
 * @author Crosbie
 * @version 2025-04 v1.0
 */
public abstract class Creature
{
    private int max_hp;
    private int hp;

    /**
     * Create a creature with strength and hit points.
     */
    public Creature(int str, int hp)
    {
        this.str = str;
        this.hp = hp;
        max_hp = hp;
    }

    /**
     * Calculate damage between 1 and strength.
     */
    public int attack()
    {
        return Randomizer.nextInt(str);
    }

    /**
     * Return true if the creature is alive.
     */
    public boolean isAlive()
    {
        return hp > 0;
    }

    /**
     * Return true if the creature is knocked out.
     */
    public boolean isKnockedOut()
    {
        return hp <= 0;
    }

    /**
     * Reduce health by the damage received.
     */
    public void takeDamage(int damage)
    {
        hp -= damage;
    }
}
