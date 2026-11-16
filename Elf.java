
/**
 * Elf is a magical creature with a chance
 * to deal double damage.
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;

    /**
     * Create an Elf with random strength and health.
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_STR - MIN_ELF_STR + 1)
                + MIN_ELF_STR - 1,
            Randomizer.nextInt(MAX_ELF_HP - MIN_ELF_HP + 1)
                + MIN_ELF_HP - 1
        );
    }

    /**
     * Elves have a 10% chance to deal double damage.
     */
    @Override
    public int attack()
    {
        int damage = super.attack();

        if (Randomizer.nextInt(10) == 1)
        {
            damage *= 2;
        }

        return damage;
    }
}
