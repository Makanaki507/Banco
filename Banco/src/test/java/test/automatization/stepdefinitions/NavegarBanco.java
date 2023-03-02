package test.automatization.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import test.automatization.tasks.NavegarPagina;
import test.automatization.userinterface.PaginaBanco;

public class NavegarBanco {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    private Actor actor = Actor.named("Alvaro");

    private PaginaBanco PaginaBanco = new PaginaBanco();

    @Dado("^Que el usuario ingresa a la página del banco$")
    public void queElUsuarioIngresaALaPáginaDelBanco() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(PaginaBanco));
    }

    @Cuando("^navega en la pagina$")
    public void navegaEnLaPagina() {
        actor.attemptsTo(NavegarPagina.articulos());
    }

    @Entonces("^selecciona documento de banco$")
    public void seleccionaDocumentoDeBanco() {

    }
}
