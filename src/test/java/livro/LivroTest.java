package livro;

import constantes.livro.Livros;
import funcionalidade.livro.LivroFunc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
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
        livroFunc01.fazerPesquisaDoLivroClean(Livros.CLEAN_CODE);

        LivroFunc livroFunc02 = new LivroFunc(driver);
        livroFunc02.fazerPesquisaDoLivroRefatoracao(Livros.SELENIUM_WEBDRIVER);
    }


    @After
    public void fecharBrowser(){
        driver.close();
    }
}
