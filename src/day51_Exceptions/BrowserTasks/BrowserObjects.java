package day51_Exceptions.BrowserTasks;

public class BrowserObjects {

    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.get("http://www.google.com/");
    }
}
