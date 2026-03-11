package losky2987.IORecorder.pageMaker;

public class htmlMedia {
    public static String image(String src, String alt) {
        return "<img src=\"" + src + "\" alt=\"" + alt + "\">";
    }

    public static String video(String src, String controls) {
        return "<video src=\"" + src + "\" " + controls + "></video>";
    }

    public static String audio(String src, String controls) {
        return "<audio src=\"" + src + "\" " + controls + "></audio>";
    }
}
