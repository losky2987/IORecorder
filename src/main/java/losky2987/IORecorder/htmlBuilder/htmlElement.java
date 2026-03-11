package losky2987.IORecorder.htmlBuilder;

public class htmlElement {
    public static String doctype = "<!DOCTYPE html>";

    public static String headings(String text, int level) {
        return "<h" + level + ">" + text + "</h" + level + ">";
    }

    public static String paragraph(String text) {
        return "<p>" + text + "</p>";
    }

    public static String link(String text, String url) {
        return "<a href=\"" + url + "\">" + text + "</a>";
    }

    public static String image(String src, String alt) {
        return "<img src=\"" + src + "\" alt=\"" + alt + "\">";
    }

    public static String makeTagHtml(String content) {
        return "<html>" + content + "</html>";
    }

    public static String makeTagHead(String content) {
        return "<head>" + content + "</head>";
    }
}
