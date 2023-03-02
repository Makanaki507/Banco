package test.automatization.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static test.automatization.userinterface.ObjetoPagina.*;

public class NavegarPagina implements Task {
    public static NavegarPagina articulos() {
        return Tasks.instrumented(NavegarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(PRODUCTOS, isPresent()));
        actor.attemptsTo(Click.on(PRODUCTOS));
        actor.attemptsTo(Click.on(INVERSIONES));
        actor.attemptsTo(WaitUntil.the(INVERSIONVIRTUAL, isPresent()));
        actor.attemptsTo(Click.on(INVERSIONVIRTUAL));
        actor.attemptsTo(WaitUntil.the(DOCUMENTOS, isPresent()));
        actor.attemptsTo(Click.on(DOCUMENTOS));
    }
}
