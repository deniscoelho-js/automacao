package livro;

import constantes.livro.Livros;
import funcionalidade.livro.LivroFunc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pagina.livro.LivroTela;
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
        livroFunc01.fazerPesquisaDoLivro(Livros.CLEAN_CODE);

        // o codigo está passando, só falta implementar o segundo objeto e as outras funcionalidades
    }

    @After
    public void fecharBrowser(){
        driver.close();
    }
}
