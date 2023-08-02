package factory;

import key.Key;
import key.SteelKey;
import lock.Lock;
import lock.SteelLock;

public class SteelSecurityFactory implements KeyLockFactory
{
    @Override
    public Key createKey() {
        return new SteelKey();
    }

    @Override
    public Lock createLock() {
        return new SteelLock();
    }
}