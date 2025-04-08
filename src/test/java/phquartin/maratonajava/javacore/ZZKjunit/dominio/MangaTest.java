package phquartin.maratonajava.javacore.ZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MangaTest {
    private Manga manga1;
    private Manga manga2;
    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Kimetsu no Yaiba", 24);
        manga1 = new Manga("Kimetsu no Yaiba", 24);
    }

    @Test
    public void testEquals() {
        assert manga1.equals(manga2);
    }
    @Test
    public void testHashCode() {
        assert manga1.hashCode() == manga2.hashCode();
    }
    @Test
    public void accessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Kimetsu no Yaiba", manga1.name());
        Assertions.assertEquals(24, manga1.episodes());
    }

}
