
/**
 * CyberDemon is a powerful demonic creature.
 * It inherits its special attack from Demon.
 */
public class CyberDemon extends Demon
{
    private static final int MAX_STR = 40;
    private static final int MIN_STR = 20;
    private static final int MAX_HP = 100;
    private static final int MIN_HP = 25;

    /**
     * Create a CyberDemon with random strength and health.
     */
    public CyberDemon()
    {
        super(
            Randomizer.nextInt(MAX_STR - MIN_STR + 1)
                + MIN_STR - 1,
            Randomizer.nextInt(MAX_HP - MIN_HP + 1)
                + MIN_HP - 1
        );
    }
}
