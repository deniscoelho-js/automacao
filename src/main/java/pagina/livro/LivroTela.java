package pagina.livro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LivroTela {

    private WebDriver driver;

//    public LivroTela(){}

    public LivroTela(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement barraPesquisa;

    @FindBy(how = How.ID, using = "nav-search-submit-button")
    private WebElement botaoPesquisar;

    @FindBy(how = How.XPATH, using = "//span[@class='a-size-medium a-color-base a-text-normal'][contains(.,'Clean Code: A Handbook of Agile Software Craftsmanship')]")
    private WebElement botaoDoLivro_Clean;

    @FindBy(how = How.XPATH, using = "//input[@id='add-to-cart-button-ubb']")
    private WebElement adicionarAoCarrinhoBotao;

    @FindBy(how = How.XPATH, using = "//a[@href='/ref=nav_logo']")
    private WebElement logoHomeImagem;

    @FindBy(how = How.XPATH, using = "(//span[@class='a-size-medium a-color-base a-text-normal'][contains(.,'Selenium Framework Design in Data-Driven Testing: Build data-driven test frameworks using Selenium WebDriver, AppiumDriver, Java, and TestNG')])[1]")
    private WebElement botaoLivro_Selenium;

    @FindBy(how = How.XPATH, using = "//span[@class='a-truncate-cut'][contains(.,'API Testing and Development with Postman: A practical guide to creating, testing, and managing APIs for automated software te…')]")
    private WebElement validaLivroAPITestingCarrinhoLink;

    @FindBy(how = How.XPATH, using = "//span[@class='a-truncate-cut'][contains(.,'Clean Code: A Handbook of Agile Software Craftsmanship')]")
    private WebElement validaLivroCleanLink;

    public LivroTela pesquisarLivro(String... textoPesquisa){
        barraPesquisa.sendKeys(textoPesquisa);
        botaoPesquisar.click();
        return this;
    }

    public LivroTela tocarLivroPesquisadoClean(){
        botaoDoLivro_Clean.click();
        return this;
    }

    public LivroTela tocarLivroPesquisadoSelenium(){
        botaoLivro_Selenium.click();
        return this;
    }

    public LivroTela adicionarAoCarrinho(){
        adicionarAoCarrinhoBotao.click();
        return this;
    }


}
