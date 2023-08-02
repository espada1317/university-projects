package components;

public class MotherBoard
{
    private String name;
    private int nmbRAMSlots;

    public MotherBoard(String name, int nmbRAMSlots) {
        this.name = name;
        this.nmbRAMSlots = nmbRAMSlots;
    }

    @Override
    public String toString() {
        return "builder.MotherBoard{" +
                "name=" + name +
                ", nmbRAMSlots=" + nmbRAMSlots +
                '}';
    }
}
