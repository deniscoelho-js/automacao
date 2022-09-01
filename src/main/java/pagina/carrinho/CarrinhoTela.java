package pagina.carrinho;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pagina.livro.LivroTela;

public class CarrinhoTela {
    private WebDriver driver;

    public CarrinhoTela(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "//a[contains(@href,'gtc')]")
    private WebElement irParaCarrinhoBotao;

    @FindBy(how = How.XPATH, using = "//span[@class='a-truncate-cut'][contains(.,'Java®: Como Programar')]")
    private WebElement validaJavaNoCarrinho;

    @FindBy(how = How.XPATH, using = "//span[@class='a-truncate-cut'][contains(.,'Código limpo: Habilidades práticas do Agile Software')]")
    private WebElement validaCodigoLimpoNoCarrinho;

    @FindBy(how = How.XPATH, using = "//span[@id='sc-subtotal-label-activecart']")
    private WebElement campoSubTotal;

    @FindBy(how = How.XPATH, using = "//input[@aria-label='Excluir C&oacute;digo limpo: Habilidades pr&aacute;ticas do Agile Software']")
    private WebElement botaoExcluirCodigoLimpo;

    public CarrinhoTela tocarIrParaCarrinho(){
        irParaCarrinhoBotao.click();
        return this;
    }

    public String verificaCodigoLimpoEstaNoCarrinho(){
        return validaCodigoLimpoNoCarrinho.getText();
    }

    public String verificaJavaEstaNoCarrinho(){
        return validaJavaNoCarrinho.getText();
    }

    public boolean verificaQuantidadeNoCarrinho(String quantidade){
        return campoSubTotal.getText().contains(quantidade);
    }

    public CarrinhoTela tocarExcluirLivroCodigoLimpo(){
        botaoExcluirCodigoLimpo.click();
        return this;
    }

}
