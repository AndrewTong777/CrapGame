import java.util.Random;
public class Die
{
    private final static Random random = new Random();
    public Die() { }
    public int getRoll()
    {
        return random.nextInt(6)+1;
    }
}