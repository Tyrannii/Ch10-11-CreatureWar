
/**
 * Balrog is a powerful demon that attacks
 * twice during each round of combat.
 */
public class Balrog extends Demon
{
    private static final int MAX_STR = 100;
    private static final int MIN_STR = 50;
    private static final int MAX_HP = 200;
    private static final int MIN_HP = 80;

    /**
     * Create a Balrog with random strength and health.
     */
    public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_STR - MIN_STR + 1)
                + MIN_STR - 1,
            Randomizer.nextInt(MAX_HP - MIN_HP + 1)
                + MIN_HP - 1
        );
    }

    /**
     * Balrogs attack twice per round.
     * Both attacks can receive the Demon bonus.
     */
    @Override
    public int attack()
    {
        int firstAttack = super.attack();
        int secondAttack = super.attack();

        return firstAttack + secondAttack;
    }
}
