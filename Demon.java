
/**
 * Demon is the base class for all demonic creatures.
 * Demons have a 5% chance to deal 50 bonus damage.
 */
public abstract class Demon extends Creature
{
    /**
     * Create a demon with the given strength and health.
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * Calculate normal damage with a chance
     * of dealing 50 additional damage.
     */
    @Override
    public int attack()
    {
        int damage = super.attack();

        if (Randomizer.nextInt(20) == 1)
        {
            damage += 50;
        }

        return damage;
    }
}
