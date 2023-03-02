package test.automatization.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/feature/Banco.feature",
        tags = "@navegacionBanco",
        glue = "test.automatization.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}
