package lock;

public class GlassLock implements Lock
{
    @Override
    public void lock() {
        System.out.println("You locked the Glass lock.Lock!");
    }
}