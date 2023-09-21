package pl.programujodpodstaw.drive;

import pl.programujodpodstaw.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String fileName);
}
