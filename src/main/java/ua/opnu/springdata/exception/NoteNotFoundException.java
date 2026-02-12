package ua.opnu.springdata.exception;

public class NoteNotFoundException extends RuntimeException {
    public NoteNotFoundException(String message) {
        super(message);
    }
}