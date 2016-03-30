package ua.goit.gojava.Files;

import ua.goit.gojava.MyExceptions.FilesNullException;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    /**
     * Array containing all files in current directory
     */

    private String directoryName;

    private int randomFilesCount;

    private List<File> files = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public Directory(String directoryName, int randomFilesCount) {
        this.directoryName = directoryName;

        for (int i = 0; i <= randomFilesCount; i++) {
        }
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        if (directoryName.length() > 255) {
            throw new IllegalArgumentException("Name is too long");
        }
        this.directoryName = directoryName;
    }

    public long getDirSize() {
        long size = 0;

        for (File file : files) {
            size += file.getFileSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "directoryName='" + directoryName + '\'' +
                "directorySize=" + getDirSize() +
                '}';
    }
}
