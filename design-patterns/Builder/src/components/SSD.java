package components;

public class SSD
{
    private String name;
    private int memoryVolume;

    public SSD(String name, int memoryVolume) {
        this.name = name;
        this.memoryVolume = memoryVolume;
    }

    @Override
    public String toString() {
        return "builder.SSD{" +
                "name=" + name +
                ", memoryVolume=" + memoryVolume +
                '}';
    }
}
