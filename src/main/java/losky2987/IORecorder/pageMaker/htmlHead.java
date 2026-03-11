package losky2987.IORecorder.pageMaker;

public class htmlHead {
    public static String startHead() {
        return "<head>";
    }

    public static String endHead() {
        return "</head>";
    }

    public static String charset() {
        return "<meta charset=\"UTF-8\">";
    }

    public static String viewport() {
        return "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
    }

    public static String meta(String name, String content) {
        return "<meta name=\"" + name + "\" content=\"" + content + "\">";
    }

    public static String title(String title) {
        return "<title>" + title + "</title>";
    }

    public static String css(String href) {
        return "<link rel=\"stylesheet\" href=\"" + href + "\">";
    }

    public static String favicon(String href) {
        return "<link rel=\"icon\" href=\"" + href + "\">";
    }

    public static String script(String src) {
        return "<script src=\"" + src + "\"></script>";
    }

    public static String base(String href) {
        return "<base href=\"" + href + "\">";
    }
}
