// public class Runner {
//     public static void main(String[] args) {
//         BasePage basePage = new HomePage();
//     }
// }

public class Runner {
    public static void main(String[] args) {
        String name = "Java Test";
        Runnable runnable = () -> System.out.println(name);
        runnable.run();
    }
}


// public class Runner {
//     public static void main(String[] args) {
//         BasePage basePage = new HomePage();
//         String pageurl = basePage.getPageUrl();
//         System.out.println(pageurl);
//     }
// }