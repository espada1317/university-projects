package factory;

import reader.Fb2Reader;
import reader.FileReader;

public class Fb2ReaderFactory extends FileReaderFactory
{
    @Override
    public FileReader createReader()
    {
        return new Fb2Reader();
    }
}
