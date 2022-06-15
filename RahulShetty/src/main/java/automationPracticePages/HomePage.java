package automationPracticePages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends CommonAPI {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[value='radio2']")
    public WebElement radioButtonTwoElement;
    @FindBy(id = "placeholder")
    public List<WebElement> suggestionInputFieldOptionsElement;
    @FindBy(id = "dropdown-class-example")
    public WebElement selectFromDropDownElement;
    @FindBy(css = "option[value='option3']")
    public WebElement selectedDropDownOptionElement;
    @FindBy(id = "checkBoxOption2")
    public WebElement checkBoxExampleOption2Element;


    public void clickRadioButtonTwo() {
        click(radioButtonTwoElement);
    }

    public List<WebElement> suggestiveDropDownOnInputField() {
        return suggestionInputFieldOptionsElement;
    }

    public void selectFromDropDownExample() {
        selectFromDropdown(selectFromDropDownElement, "Option3");
    }

    public void checkBoxExampleOption2() {
        click(checkBoxExampleOption2Element);
        checkBoxIsChecked(checkBoxExampleOption2Element);
        waitFor(2);

    }


}
