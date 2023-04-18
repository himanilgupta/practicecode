// public class HomePage extends BasePage {
//     private String getPageUrl() {
//         this.pageUrl = "http://HomePage.com";
//         return this.pageUrl;
//     }
// }
public class HomePage extends BasePage {
    public HomePage() {
        System.out.println("Login Page Created.");
    }
    public HomePage(String pageLink) {
        setPageLink(pageLink);
    }
}