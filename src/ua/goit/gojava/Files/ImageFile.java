package ua.goit.gojava.Files;

import java.util.Date;

/**
 * Class {@code ImageFile} inherited from class {@code File}
 * and may contain only image-data
 * @version 1.0 09.03.2016
 * @author Alex Korneyko
 */
public class ImageFile extends File {

    private String imageFileFormat;

    public ImageFile(String fileName, int fileSize, Date createFileDate, boolean readOnly,
                     boolean hidden, String parentDirectory, String imageFileFormat) {

        super(fileName, fileSize, createFileDate, readOnly, hidden, parentDirectory);
        this.imageFileFormat = imageFileFormat;
    }

    public String getImageFileFormat() {
        return imageFileFormat;
    }

    public void setImageFileFormat(String imageFileFormat) {
        if(imageFileFormat.length() > 255){
            throw new IllegalArgumentException();
        }
        this.imageFileFormat = imageFileFormat;
    }

    @Override
    public String toString() {
        return super.toString() + "fileType= image " +
                "imageFileFormat='" + imageFileFormat + '\'' +
                '}';
    }
}
