package factory;

import key.Key;
import lock.Lock;

public interface KeyLockFactory
{
    Key createKey();
    Lock createLock();
}