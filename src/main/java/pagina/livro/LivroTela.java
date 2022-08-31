package pagina.livro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LivroTela {

    private WebDriver driver;

    public LivroTela(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement barraPesquisa;

    @FindBy(how = How.ID, using = "nav-search-submit-button")
    private WebElement botaoPesquisar;

    @FindBy(how = How.XPATH, using = "//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(.,'Código limpo: Habilidades práticas do Agile Software')]")
    private WebElement botaoDoLivro_Clean;

    @FindBy(how = How.XPATH, using = "//input[@id='add-to-cart-button']")
    private WebElement adicionarAoCarrinhoBotao;

    @FindBy(how = How.XPATH, using = "//span[@class='a-size-base-plus a-color-base a-text-normal'][contains(.,'Java®: Como Programar')]")
    private WebElement botaoLivro_Java;

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
        botaoLivro_Java.click();
        return this;
    }

    public LivroTela adicionarAoCarrinho(){
        adicionarAoCarrinhoBotao.click();
        return this;
    }

}
