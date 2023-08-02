package chest;

import factory.KeyLockFactory;
import key.Key;
import lock.Lock;

public class Chest
{
    private Lock lock;
    private Key key;

    public Chest(KeyLockFactory factory)
    {
        lock = factory.createLock();
        key = factory.createKey();
    }

    public void interact()
    {
        lock.lock();
        key.unlock();
    }
}
