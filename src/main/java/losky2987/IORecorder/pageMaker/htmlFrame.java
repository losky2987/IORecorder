package losky2987.IORecorder.pageMaker;

public class htmlFrame {
    public static String startHTML(String langugage) {
        if (langugage == null || langugage.isEmpty()) {
            langugage = "zh-CN";
        }
        return "<html lang=\"" + langugage + "\">";
    }

    public static String endHTML() {
        return "</html>";
    }
}
