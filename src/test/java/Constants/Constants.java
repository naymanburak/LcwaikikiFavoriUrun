package Constants;

import org.openqa.selenium.By;

public class Constants {
    public static String LINK = "https://www.lcwaikiki.com/tr-TR/TR";
    public static String GOMLEKLINK = "https://www.lcwaikiki.com/tr-TR/TR/kategori/erkek/gomlek";
    public static String FAVORILINK = "https://www.lcwaikiki.com/tr-TR/TR/favorilistem";
    public static final By COOKIE = By.xpath("//*[@class='btn btn-primary btn-sm acceptcookies  ']");
    public static final By ERKEK = By.id("mega_menu_dd_6");
    public static final By GOMLEK = By.cssSelector("#dd_mmm_6_169 > li:nth-child(2) > a");
    public static final By SIRALA = By.id("dropdownMenu1");
    public static final By ENYUKSEK = By.id("hfl_3");
    public static String ENYUKSEKKONTROL = "https://www.lcwaikiki.com/tr-TR/TR/kategori/erkek/gomlek?LastFilter=m_1007&Sort=PriceDESC";
    public static String GOMLEK_LIST = ("//*[@class='emi-item fav']");
    public static final By FAV_BUTTON = By.xpath("/html/body/div[5]/div[2]/div[1]/div[4]/div/div[2]/a/div");
    public static final By URUNSAYISI = By.xpath("//*[@id='itemCount']/span");
    public static final By SECILENURUNSAYISI = By.xpath("//*[@id='selectedItemCount']/span");
    public static final By TUMUNU_SEC = By.id("selectAll");
    public static final By SEC_SIL = By.id("removeSelected");
    public static final By NOFAV = By.xpath("//*[@id='divModels']/div[3]/p[1]");

}
