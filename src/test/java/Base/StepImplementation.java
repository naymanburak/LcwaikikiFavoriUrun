package Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Constants.Constants.*;

/**
 * @author  Mustafa Burak Nayman
 * @version 1.0
 * @since   2021-07-25
*/

public class StepImplementation extends BasePage {

    private static Logger logger = LogManager.getLogger(BasePage.class);

    @Step("Ana sayfanin acildigi kontrol edilir.")
    public void anaSayfaKontrol() {
        logger.info("Ana sayfanin acildigi kontrol ediliyor...");
        assertionUrl(LINK);
        click(COOKIE);
        logger.info("Ana sayfa acilmasi kontrolü saglandi...");
    }

    @Step("Menuden Erkek seceneginin uzerinde durulur.")
    public void hoverErkek() throws InterruptedException {
        logger.info("Erkek menusu aciliyor...");
        hoverElement(ERKEK);
        waitForSecond(1);
        logger.info("Erkek menusu acildi...");
    }

    @Step("Acilan pencereden Gomlek secilir")
    public void gomlekSec() {
        logger.info("Gomlek seciliyor...");
        hoverElement(GOMLEK);
        click(GOMLEK);
        logger.info("Gomlek secildi...");
    }

    @Step("Erkek Gömlek sayfası acildigi kontrol edilir.")
    public void gomlekSayfaKontrol() {
        logger.info("Erkek gomlek sayfasinin acildiği kontrol ediliyor....");
        assertionUrl(GOMLEKLINK);
        logger.info("Erkek gomlek sayfasinin acildiği kontrol edildi....");
    }

    @Step("Sırala Menusunden 'En yüksek fiyattan' secenegi secilir.")
    public void siralaSec() {
        logger.info("Sırala Menusunden 'En yüksek fiyattan' secenegi seciliyor...");
        click(SIRALA);
        click(ENYUKSEK);
        logger.info("Sırala Menusunden 'En yüksek fiyattan' secenegi secildi...");
    }

    @Step("Secimin 'En yüksek fiyattan' oldugu kontrol edilir.")
    public void siralaKontrol() throws InterruptedException {
        logger.info("Secimin 'En yüksek fiyattan' oldugu kontrol ediliyor...");
        waitForSecond(1);
        assertionUrl(ENYUKSEKKONTROL);
        logger.info("Secimin 'En yüksek fiyattan' oldugu kontrol edildi...");
    }

    @Step("Ilk 3 urun favorilere eklenir")
    public void favoriEkle() throws InterruptedException {
        logger.info("Ilk 3 urun favorilere ekleniyor...");
        listElements(GOMLEK_LIST);
        logger.info("Ilk 3 urun favorilere eklenildi...");
    }

    @Step("Sag ustteki favorilerim butonuna tiklanmali")
    public void favoriListesi() {
        logger.info("Sag ustteki favorilerim butonuna tiklaniyor...");
        click(FAV_BUTTON);
        logger.info("Sag ustteki favorilerim butonuna tiklanildi...");
    }

    @Step("Favorilerim sayfasinin acildigi kontrol edilir.")
    public void favorilerimSayfaKontrol() {
        logger.info("Favorilerim sayfasinin acildigi kontrol ediliyor...");
        assertionUrl(FAVORILINK);
        logger.info("Favorilerim sayfasinin acildigi kontrol edildi...");
    }

    @Step("Favori olarak secilen 3 urunun orada oldugu kontrol edilmeli")
    public void urunKontrol() {
        logger.info("Favori olarak secilen 3 urunun orada oldugu kontrol ediliyor...");
        checkXpath(URUNSAYISI, "3");
        logger.info("Favori olarak secilen 3 urunun orada oldugu kontrol edildi...");
    }

    @Step("Tümünü sec butonuna tikla")
    public void tumunuSec() {
        logger.info("Tümünü sec butonuna tiklaniyor...");
        click(TUMUNU_SEC);
        logger.info("Tümünü sec butonuna tiklanildi...");
    }

    @Step("Tümünün secildigi kontrol et.")
    public void tumunuSecKontrol() {
        logger.info("Tümünün secildigi kontrol ediliyor...");
        checkXpath(SECILENURUNSAYISI, "3");
        logger.info("Tümünün secildigi kontrol edildi...");
    }

    @Step("Secilenleri sil butonuna tikla")
    public void secilenSil() throws InterruptedException {
        logger.info("Secilenleri sil butonuna tiklaniyor...");
        click(SEC_SIL);
        waitForSecond(1);
        logger.info("Secilenleri sil butonuna tiklanildi...");
    }

    @Step("'Favori Urununuz Yok' metni sayfada gözlenmelidir")
    public void ürünYokKontrol() throws InterruptedException {
        logger.info("'Favori Urununuz Yok' metni sayfada gözleniliyor...");
        waitForSecond(1);
        checkXpath(NOFAV, "Favori Ürününüz Yok");
        logger.info("'Favori Urununuz Yok' metni sayfada gözlenildi...");
    }
}
