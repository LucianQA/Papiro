package papetariePapiro;
//import com.sun.xml.internal.ws.api.pipe.PipelineAssembler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Papiro {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://papiro.ro/");
        chrome.manage().window().maximize();

        // Acceptare Cookies
        WebElement cookies = chrome.findElement(By.cssSelector("#cookie_action_close_header"));
        cookies.click();

        //Adaugare bloc desen din lista de produse in cos
        WebElement artePlastice = chrome.findElement(By.xpath("/html/body/header/div[3]/div/div/div[1]/div[2]/div[1]/ul/li[9]/a"));
        artePlastice.click();
        //wait(2000);
        WebElement sketches = chrome.findElement(By.xpath("/html/body/header/div[3]/div/div/div[1]/div[2]/div[1]/ul/li[9]/div/div[1]/div[1]/div/div/h3/a"));
        sketches.click();
        //WebElement blocA3 = chrome.findElement(By.cssSelector("body > div.premmerce-filter-ajax-container > div > div > div > div.main-content.col-lg-9.col-md-8.has-sidebar > ul > li.product-item.col-bg-4.col-lg-4.col-md-4.col-sm-4.col-xs-6.col-ts-12.style-16.product.type-product.post-6566.status-publish.first.instock.product_cat-bloc-pentru-desen-special-si-schite.has-post-thumbnail.taxable.shipping-taxable.purchasable.product-type-simple > div > div.product-info.equal-elem > h3 > a"));
        //blocA3.click();
        wait(2000);
        WebElement addToBasket1 = chrome.findElement(By.cssSelector("body > div.premmerce-filter-ajax-container > div > div > div > div.main-content.col-lg-9.col-md-8.has-sidebar > ul > li.product-item.col-bg-4.col-lg-4.col-md-4.col-sm-4.col-xs-6.col-ts-12.style-16.product.type-product.post-6566.status-publish.first.instock.product_cat-bloc-pentru-desen-special-si-schite.has-post-thumbnail.taxable.shipping-taxable.purchasable.product-type-simple > div > div.product-info.equal-elem > div > div.add-to-cart > a"));
        addToBasket1.click();
        wait(3000);

        //Functia de add to favourites nu functioneaza
        WebElement hartie = chrome.findElement(By.xpath("//*[@id=\"menu-cat-menu-1\"]/li[2]/a"));
        hartie.click();
        WebElement hartieCopiator = chrome.findElement(By.xpath( "//*[@id=\"menu-cat-menu-1\"]/li[2]/div/div[2]/div[1]/div/div/div/figure/a/img"));
        hartieCopiator.click();
        WebElement addToFavourites = chrome.findElement(By.xpath("//*[@id=\"menu-cat-menu-1\"]/li[2]/div/div[2]/div[1]/div/div/div/figure/a/img"));
        addToFavourites.click();


        //wait(2000);

        WebElement favourites = chrome.findElement(By.cssSelector("#menu-item-11062 > a"));
        favourites.click();
        WebElement addToBasket = chrome.findElement(By.cssSelector("#yith-wcwl-row-6566 > td.product-add-to-cart > a"));
        addToBasket.click();
        wait(2000);

        //Cautare produs in bara de cautare si adaugare in cos
        WebElement searchField = chrome.findElement(By.cssSelector("#header > div.header-middle > div > div > div.header-control > div.block-search > div > form > div.form-content.search-box.results-search.instant-search-box > div > input"));
        searchField.click();
        searchField.sendKeys("Daco Px560");
        wait(5000);
        searchField.sendKeys(Keys.ENTER);
        WebElement addToBaket = chrome.findElement(By.cssSelector("#product-24139 > div.summary.entry-summary > form > button"));
        addToBaket.click();
        wait(300);

        //Verificare cos
        WebElement basket = chrome.findElement(By.cssSelector("#header > div.header-middle > div > div > div.header-control > div.block-minicart.kuteshop-mini-cart.kuteshop-dropdown > div.shopcart-dropdown.block-cart-link > a.link-dropdown.style1 > span.flaticon-cart01.icon"));
        basket.click();
        WebElement checkBasket = chrome.findElement(By.cssSelector("#header > div.header-middle > div > div > div.header-control > div.block-minicart.kuteshop-mini-cart.kuteshop-dropdown > div.shopcart-description > div > div > p.woocommerce-mini-cart__buttons.buttons > a:nth-child(1)"));
        checkBasket.click();
        WebElement increaseQuantity = chrome.findElement(By.cssSelector("body > main > div > div.row > div > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-quantity > div > div > a.btn-number.qtyplus.quantity-plus"));
        increaseQuantity.click();
        increaseQuantity.click();
        wait(1000);
        WebElement updateBasket = chrome.findElement(By.cssSelector("body > main > div > div.row > div > div > div > form > table > tbody > tr:nth-child(3) > td > button"));
        updateBasket.click();
        WebElement scroll = chrome.findElement(By.cssSelector("body"));
        scroll.sendKeys(Keys.PAGE_DOWN);
        wait(3000);
        WebElement continueOrder = chrome.findElement(By.cssSelector("body > main > div > div.row > div > div > div > div.cart-collaterals > div > div > a"));
        continueOrder.click();

        //Completarea formularului de comanda
        WebElement customerType = chrome.findElement(By.cssSelector("#smartbill_billing_type"));
        customerType.click();
        customerType.sendKeys(Keys.ARROW_DOWN);
        wait(3000);
        customerType.sendKeys(Keys.ARROW_UP);
        WebElement name = chrome.findElement(By.cssSelector("#billing_first_name"));
        name.click();
        name.sendKeys("Lucian");
        WebElement surname = chrome.findElement(By.cssSelector("#billing_last_name"));
        surname.click();
        surname.sendKeys("Razec");
        WebElement companyName = chrome.findElement(By.cssSelector("#billing_company"));
        companyName.click();
        companyName.sendKeys("Capodopera SRL");
        wait(3000);
        WebElement street = chrome.findElement(By.cssSelector("#billing_address_1"));
        street.click();
        street.sendKeys("Str. Pacii Nr.2022");
        WebElement streetDetails = chrome.findElement(By.cssSelector("#billing_address_2"));
        streetDetails.click();
        streetDetails.sendKeys("World Wide building");
        WebElement city = chrome.findElement(By.cssSelector("#billing_city"));
        city.click();
        city.sendKeys("Floresti");
        WebElement county = chrome.findElement(By.cssSelector("#billing_postcode"));
        county.click();
        WebElement countyField = chrome.findElement(By.cssSelector("#select2-billing_state-container > span"));
        countyField.click();
        WebElement fillCounty = chrome.findElement(By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input"));
        fillCounty.sendKeys("Cl");
        wait(3000);
        fillCounty.sendKeys(Keys.ENTER);
        WebElement postCode = chrome.findElement(By.cssSelector("#billing_postcode"));
        postCode.click();
        postCode.sendKeys("4334001");
        WebElement phone = chrome.findElement(By.cssSelector("#billing_phone"));
        phone.click();
        phone.sendKeys("0774342732");
        WebElement email = chrome.findElement(By.cssSelector("#billing_email"));
        email.click();
        email.sendKeys("lucian.razec@gmail.com");
        WebElement checkoutPage = chrome.findElement(By.xpath("/html/body"));
        WebElement tickAccount = chrome.findElement(By.cssSelector("#createaccount"));
        tickAccount.click();
        checkoutPage.sendKeys(Keys.PAGE_DOWN);
        WebElement userCreate = chrome.findElement(By.cssSelector("#account_username"));
        userCreate.click();
        userCreate.sendKeys("ANONIMUS");
        WebElement passwordCreate = chrome.findElement(By.cssSelector("#account_password"));
        passwordCreate.click();
        passwordCreate.sendKeys("PassWord@11");
        WebElement delivery = chrome.findElement(By.cssSelector("#shipping_method > li:nth-child(1) > label"));
        delivery.click();
        wait(3000);
        WebElement payCash = chrome.findElement(By.cssSelector("#payment > ul > li.wc_payment_method.payment_method_cod > label"));
        payCash.click();
        wait(1000);
        WebElement agreeTerms = chrome.findElement(By.cssSelector("#terms"));
        agreeTerms.click();
        wait(1000);
        WebElement backTop = chrome.findElement(By.cssSelector("body > a"));
        backTop.click();
        wait(6000);

        //Eliminarea produselor din cos si intoarcerea pe pagina principala
        WebElement homePage = chrome.findElement(By.cssSelector("#header > div.header-middle > div > div > div.logo > a > img"));
        homePage.click();
        WebElement basketEmpty = chrome.findElement(By.cssSelector("#header > div.header-middle > div > div > div.header-control > div.block-minicart.kuteshop-mini-cart.kuteshop-dropdown > div.shopcart-dropdown.block-cart-link > a.link-dropdown.style1 > span.flaticon-cart01.icon"));
        basketEmpty.click();
        WebElement checkEmptyBasket = chrome.findElement(By.cssSelector("#header > div.header-middle > div > div > div.header-control > div.block-minicart.kuteshop-mini-cart.kuteshop-dropdown > div.shopcart-description > div > div > p.woocommerce-mini-cart__buttons.buttons > a:nth-child(1)"));
        checkEmptyBasket.click();
        WebElement removeB = chrome.findElement(By.cssSelector("body > main > div > div.row > div > div > div > form > table > tbody > tr:nth-child(2) > td.product-remove > a"));
        removeB.click();
        wait(6000);
        WebElement removeA = chrome.findElement(By.cssSelector("body > main > div > div.row > div > div > div > form > table > tbody > tr:nth-child(1) > td.product-remove > a"));
        removeA.click();
        wait(6000);
        WebElement backToShop = chrome.findElement(By.cssSelector("body > main > div > div.row > div > div > div > p.return-to-shop > a"));
        backToShop.click();
        wait(5000);
        WebElement home = chrome.findElement(By.cssSelector("#header > div.header-middle > div > div > div.logo > a > img"));
        home.click();
        wait(8000);

        //Inchidere browser
        chrome.close();






    }

        private static void wait(int seconds){
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e ){
                e.printStackTrace();
            }
        }


}
