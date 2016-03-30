package ua.goit.gojava.MyExceptions;

/**
 * Class {@code FilesNullException} is exception for damaged directories
 * (damage in the file system)
 * @version 1.0 12.03.2016
 * @author Alex Korneyko
 */
public class FilesNullException extends Exception {

    private String msg;

    public FilesNullException(String message){
        msg = message;
    }

    @Override
    public String getMessage(){
        return msg;
    }
}
