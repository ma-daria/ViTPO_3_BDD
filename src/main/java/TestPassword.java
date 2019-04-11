import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TestPassword {

    Password classPassword;
    String servis;
    String password;
    String result;

    @cucumber.api.java.en.Given("^I Have class password$")
    public void iHaveClassPassword() {
        classPassword = new Password();
    }

    @When("^I have entered \"([^\"]*)\" as servis operand$")
    public void iHaveEnteredAsServisOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        servis = arg0;
    }

    @And("^I have entered \"([^\"]*)\" as password operand$")
    public void iHaveEnteredAsPasswordOperand(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        password = arg0;
    }

    @And("^I add password$")
    public void iAddPassword() {
        classPassword.addPassword(servis, password);
    }

    @And("^I get password for \"([^\"]*)\"$")
    public void iGetPasswordFor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        result = classPassword.getPassword(arg0);
    }

    @Then("^The result should be \"([^\"]*)\"$")
    public void theResultShouldBe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        if (arg0.equals("null"))
            arg0 = null;
        Assert.assertEquals(arg0, result);
    }

    @And("^I edit password for \"([^\"]*)\"$")
    public void iEditPasswordFor(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        classPassword.Edit(arg0, password);
    }
}
