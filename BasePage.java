// public class BasePage {
//     public String pageUrl = "http://BasePage.com";
//     public String getPageUrl() {
//         return this.pageUrl;
//     }
// }
public class BasePage {
    private String pageLink;
    public BasePage() {
        System.out.println("Base Page Created.");
    }
    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }
}