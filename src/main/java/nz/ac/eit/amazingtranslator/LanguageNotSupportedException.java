package nz.ac.eit.amazingtranslator;

public class LanguageNotSupportedException extends Throwable {

    private String language;

    public LanguageNotSupportedException(String language) {
        this.language=language;
    }

    @Override
    public String getMessage() {
        return "The language "+language+" is not supported";
    }

}
