package funcionalidade.livro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagina.livro.LivroTela;

public class LivroFunc {
    private WebDriver driver;

    public LivroFunc(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fazerPesquisaDoLivroCodigoLimpo(String textoPesquisado){
        new LivroTela(driver)
                .pesquisarLivro(textoPesquisado)
                .tocarLivroPesquisadoCodigoLimpo()
                .adicionarAoCarrinho();
    }

    public void fazerPesquisaDoLivroJava(String textoPesquisado){
        new LivroTela(driver)
                .pesquisarLivro(textoPesquisado)
                .tocarLivroPesquisadoSelenium()
                .adicionarAoCarrinho();
    }
}
