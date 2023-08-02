package factory;

import key.Key;
import key.MagicKey;
import lock.Lock;
import lock.MagicLock;

public class MagicSecurityFactory implements KeyLockFactory
{
    @Override
    public Key createKey() {
        return new MagicKey();
    }

    @Override
    public Lock createLock() {
        return new MagicLock();
    }
}