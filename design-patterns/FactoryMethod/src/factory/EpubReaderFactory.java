package factory;

import reader.EpubReader;
import reader.FileReader;

public class EpubReaderFactory extends FileReaderFactory
{
    @Override
    public FileReader createReader() {
        return new EpubReader();
    }
}
