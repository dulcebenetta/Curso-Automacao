package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BoardPage {
    @FindBy(how = How.XPATH, using = "//a[@class='board-header-btn board-header-btn-name js-rename-board']/span[]")
    private WebElement boardName;
    @FindBy (how = How.XPATH, using = "//div[div[textarea[@aria-label='A fazer']]]")
    private WebElement toDoList;
    @FindBy (how = How.XPATH, using = "//div]")
    private WebElement inProgressList;
    @FindBy (how = How.XPATH, using = "//div]")
    private WebElement doneList;
    @FindBy(how = How.XPATH, using = "//*[@class=']")
    private WebElement imputCarddName;
    @FindBy(how = How.XPATH, using = "//imput[@value=']")
    private WebElement addCardButton;
    @FindBy(how = How.XPATH, using = "//")
    private WebElement txtComment;
    @FindBy(how = How.XPATH, using = "//")
    private WebElement saveCommentdButton;
    @FindBy(how = How.XPATH, using = "//]")
    private WebElement closeCardButton;
    @FindBy(how = How.XPATH, using = "//")
    private List<WebElement> elementsToDo;


//*[@id="board"]/div[1]/div[1]/div[1]/textarea
}


