package pl.programujodpodstaw.file;

public abstract class AbstractFile implements File {
    protected final String name;
    protected final int size;

    public AbstractFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
