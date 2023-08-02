import chest.Chest;
import factory.GlassSecurityFactory;
import factory.KeyLockFactory;
import factory.MagicSecurityFactory;
import factory.SteelSecurityFactory;

public class Main
{
    private static Chest configureLockKey(String type)
    {
        Chest chest = null;
        KeyLockFactory keyLockFactory;

        switch (type) {
            case "magic":
                keyLockFactory = new MagicSecurityFactory();
                chest = new Chest(keyLockFactory);
                break;
            case "glass":
                keyLockFactory = new GlassSecurityFactory();
                chest = new Chest(keyLockFactory);
                break;
            case "steel":
                keyLockFactory = new SteelSecurityFactory();
                chest = new Chest(keyLockFactory);
                break;
        }

        return chest;
    }

    public static void main(String[] args)
    {
        Chest chest = configureLockKey("magic");
        chest.interact();

        chest = configureLockKey("glass");
        chest.interact();

        chest = configureLockKey("steel");
        chest.interact();
    }
}