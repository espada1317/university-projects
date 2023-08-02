import builders.PCBuilder;
import builders.PCManualBuilder;
import components.Manual;
import components.PC;
import director.Director;

public class Main
{
    public static void main(String[] args)
    {
        Director director = new Director();
        PCBuilder pcBuilder = new PCBuilder();
        director.constructGamingPC(pcBuilder);
        PC pc = pcBuilder.build();
        System.out.println("components.PC build:\n" + pc.print());

        PCManualBuilder manualBuilder = new PCManualBuilder();
        director.constructUniversityPC(manualBuilder);
        Manual pcManual = manualBuilder.build();
        System.out.println("\ncomponents.PC build:\n" + pcManual.print());
    }
}