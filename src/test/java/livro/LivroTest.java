package livro;

import constantes.livro.Livros;
import funcionalidade.carrinho.CarrinhoFunc;
import funcionalidade.livro.LivroFunc;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pagina.carrinho.CarrinhoTela;
import webdriver.Driver;

public class LivroTest {
    private WebDriver driver;

    @Before
    public void criarDriver(){
        Driver livroDriver = new Driver();
        driver = livroDriver.Webdriver();
    }

    @Test
    public void LivroTest(){
        LivroFunc livroFunc01 = new LivroFunc(driver);
        livroFunc01.fazerPesquisaDoLivroCodigoLimpo(Livros.CODIGO_LIMPO);

        LivroFunc livroFunc02 = new LivroFunc(driver);
        livroFunc02.fazerPesquisaDoLivroJava(Livros.JAVA_COMO_PROGRAMAR);

        CarrinhoFunc carrinhoFunc = new CarrinhoFunc(driver);
        carrinhoFunc.irParaCarrinho();

        CarrinhoTela carrinhoTela = new CarrinhoTela(driver);

        // Valida se os 2 estão no carrinho
        Assert.assertEquals(Livros.VALIDAR_CODIGO_LIMPO, carrinhoTela.verificaCodigoLimpoEstaNoCarrinho());
        Assert.assertEquals(Livros.VALIDAR_JAVA, carrinhoTela.verificaJavaEstaNoCarrinho());

        Assert.assertTrue(carrinhoTela.verificaQuantidadeNoCarrinho("2"));

        //falta implementar retirar 1 item do carrinho e validar se o item está fora

    }


    @After
    public void fecharBrowser(){
        driver.close();
    }
}
