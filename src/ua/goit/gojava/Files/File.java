package ua.goit.gojava.Files;

import java.util.Date;

/**
 * Class {@code File} is super-class for all files
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public abstract class File {

    private String fileName;
    private int fileSize;
    private Date createFileDate;
    private boolean readOnly;
    private boolean hidden;
    private String parentDirectory;

    public File(String fileName, int fileSize, Date createFileDate, boolean readOnly,
                boolean hidden, String parentDirectory) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.createFileDate = createFileDate;
        this.readOnly = readOnly;
        this.hidden = hidden;
        this.parentDirectory = parentDirectory;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        if(fileName.length() > 255){
            throw new IllegalArgumentException();
        }

        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public Date getCreateFileDate() {
        return createFileDate;
    }

    public void setCreateFileDate(Date createFileDate) {
        this.createFileDate = createFileDate;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(String parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", createFileDate=" + createFileDate +
                ", readOnly=" + readOnly +
                ", hidden=" + hidden +
                '}';
    }


}
