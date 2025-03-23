package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class hoverPage {
    private WebDriver driver;
    private By figure = By.className("figure");
    private By captionBox = By.className("figcaption");

    public hoverPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * @param i = input to hover on
     */
    public figCaption hoverOver(int i){
        WebElement fig = driver.findElements(figure).get(i - 1);
        Actions action = new Actions(driver);
        action.moveToElement(fig).perform();
        return new figCaption(fig.findElement(captionBox));
    }

    public class figCaption{
        private WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");

        public figCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean captionIsVisible(){
            return caption.isDisplayed();
        }

        public String getString(){
            return caption.findElement(name).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
