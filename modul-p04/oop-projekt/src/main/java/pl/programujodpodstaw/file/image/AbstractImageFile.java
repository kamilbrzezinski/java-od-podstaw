package pl.programujodpodstaw.file.image;

import pl.programujodpodstaw.file.AbstractFile;
import pl.programujodpodstaw.file.FileType;

public class AbstractImageFile extends AbstractFile {

    public AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
