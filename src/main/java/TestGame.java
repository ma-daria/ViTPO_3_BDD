import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestGame {
    Game classGame;
    String servis;
    String password;
    String letter;
    String result;
    boolean resultB;


    @Given("^I Have class Game$")
    public void iHaveClassGame() {
        Password classPassword = new Password();
        classGame = new Game(classPassword);
    }

    @When("^I have enteredGame \"([^\"]*)\" as servis operand$")
    public void iHaveEnteredGameAsServisOperand(String arg0) throws Throwable {
        servis = arg0;
    }

    @And("^I have enteredGame \"([^\"]*)\" as password operand$")
    public void iHaveEnteredGameAsPasswordOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        password = arg0;
    }

    @And("^I add passwordGame$")
    public void iAddPasswordGame() {
        resultB = classGame.addPassword(servis, password);
    }

    @Then("^The result bool shouldGame be \"([^\"]*)\"$")
    public void theResultBoolShouldGameBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean arg;
        if (arg0.equals("false"))
            arg = false;
        else
            arg = true;
        Assert.assertEquals(arg, resultB);
    }

    @And("^I have enteredGame \"([^\"]*)\" as letter operand$")
    public void iHaveEnteredGameAsLetterOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        letter = arg0;
    }


    @And("^I input letter$")
    public void iInputLetter() {
        resultB = classGame.inputLetter(letter);
    }

    @And("^I add servis \"([^\"]*)\"$")
    public void iAddServis(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        resultB = classGame.inputServis(arg0);
    }

    @Then("^The result shouldGame be \"([^\"]*)\"$")
    public void theResultShouldGameBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (arg0.equals("null"))
            arg0 = null;
        Assert.assertEquals(arg0, result);
    }

    @And("^I get password$")
    public void iGetPassword() {
        result = classGame.getPassword();
    }
}
