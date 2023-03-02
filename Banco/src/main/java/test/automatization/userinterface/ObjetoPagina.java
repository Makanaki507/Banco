package test.automatization.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ObjetoPagina {
    public static Target PRODUCTOS =
            Target.the("Selecciona Bolsa").located(By.xpath("//a[@id='menu-productos']"));

    public static Target INVERSIONES =
            Target.the("Selecciona Bolsa").located(By.xpath("//a[@id='header-productos-inversiones']"));

    public static Target INVERSIONVIRTUAL =
            Target.the("Selecciona Bolsa").located(By.xpath("//a[contains(.,'Inversión Virtual')]"));
    public static Target DOCUMENTOS =
            Target.the("Selecciona Bolsa").located(By.xpath("//a[@aria-expanded='true']"));
}
