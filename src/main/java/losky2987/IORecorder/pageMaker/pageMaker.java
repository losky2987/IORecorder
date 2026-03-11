package losky2987.IORecorder.pageMaker;

public class pageMaker {
    public static String makeDefaultPage(String title) {
        return htmlDocType.doctype() + htmlFrame.startHTML("zh-CN") +
        htmlHead.startHead() + htmlHead.charset() + htmlHead.viewport() + htmlHead.title(title) + htmlHead.endHead() +
        htmlBody.startBody() + htmlBody.endBody() + htmlFrame.endHTML();
    }
}
