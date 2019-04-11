import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestPassword {

    @cucumber.api.java.en.Given("^I Have class password$")
    public void iHaveClassPassword() {
    }

    @When("^I have entered \"([^\"]*)\" as servis operand$")
    public void iHaveEnteredAsServisOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I have entered \"([^\"]*)\" as password operand$")
    public void iHaveEnteredAsPasswordOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I add password$")
    public void iAddPassword() {

    }

    @Then("^The result should be \"([^\"]*)\"$")
    public void theResultShouldBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
