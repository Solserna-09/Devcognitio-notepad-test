package net.onlinenotepad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.online-notepad.net/")
public class OnlinenotepadHomePage extends PageObject {
    public static final Target BTN_NOTE_TEXT = Target.the("clic note text").located(By.id("richtextnote-tab"));
    public static final Target BTN_PENCIL = Target.the("clic pencil").located(By.id("editNoteName"));
    public static final Target TXT_TITLE = Target.the("clic title").located(By.id("noteName"));

    public static final Target BTN_B = Target.the("clic B").located(By.xpath("(//button[@class='ck ck-button ck-off'])[1]"));
    public static final Target TXT_NOTE = Target.the("write note").located(By.id("editor"));
    public static final Target BTN_SAVE= Target.the("clic save").located(By.xpath("//button[@class='btn save-file-btn saveNotesBtn richtextnoteBtn']"));
}

