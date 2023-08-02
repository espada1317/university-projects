package factory;

import key.GlassKey;
import key.Key;
import lock.GlassLock;
import lock.Lock;

public class GlassSecurityFactory implements KeyLockFactory
{
    @Override
    public Key createKey() {
        return new GlassKey();
    }

    @Override
    public Lock createLock() {
        return new GlassLock();
    }
}