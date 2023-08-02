package key;

public class SteelKey implements Key
{
    @Override
    public void unlock() {
        System.out.println("You unlocked a lock with Steel key.Key!");
    }
}