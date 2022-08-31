package funcionalidade.carrinho;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagina.carrinho.CarrinhoTela;

public class CarrinhoFunc {
    private WebDriver driver;

    public CarrinhoFunc(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void irParaCarrinho(){
        new CarrinhoTela(driver)
                 .tocarIrParaCarrinho()
                ;
    }

//    public void verificaCleanCode(){
//        new CarrinhoTela(driver)
//                .verificaCleanCodeEstaNoCarrinho()
//                ;
//    }

//    public void verificaSelenium(){
//        new CarrinhoTela(driver)
//                .verificaSeleniumEstaNoCarrinho()
//                ;
//    }
}
