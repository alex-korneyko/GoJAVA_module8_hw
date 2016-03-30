package ua.goit.gojava.Files;

import java.util.Date;

/**
 * Class {@code TextFile} inherited from class {@code File}
 * and may contain only text-data
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class TextFile extends File {

    private String textCodePage;

    public TextFile(String fileName, int fileSize, Date createFileDate, boolean readOnly,
                    boolean hidden, String parentDirectory, String textCodePage) {

        super(fileName, fileSize, createFileDate, readOnly, hidden, parentDirectory);
        this.textCodePage = textCodePage;
    }

    public String getTextCodePage() {
        return textCodePage;
    }

    public void setTextCodePage(String textCodePage) {
        if (textCodePage.length() > 255){
            throw new IllegalArgumentException();
        }
        this.textCodePage = textCodePage;
    }

    @Override
    public String toString() {
        return super.toString() + "fileType= text " +
                "textCodePage='" + textCodePage + '\'' +
                '}';
    }
}
