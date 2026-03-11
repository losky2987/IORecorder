package losky2987.IORecorder.pageMaker;

public class htmlText {
    public static String title(int level, String text) {
        if (level < 1 || level > 6) {
            throw new IllegalArgumentException("Heading level must be between 1 and 6.");
        }
        return "<h" + level + ">" + text + "</h" + level + ">";
    }

    public static String paragraph(String text) {
        return "<p>" + text + "</p>";
    }

    public static String newline() {
        return "<br>";
    }

    public static String slide() {
        return "<hr>";
    }

    public static String strong(String text) {
        return "<strong>" + text + "</strong>";
    }
}
