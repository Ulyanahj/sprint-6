import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    Feline mockedFeline = Mockito.mock(Feline.class);

    @Test
    public void testGetLion() throws Exception {
        Mockito.when(mockedFeline.getKittens()).thenReturn(7);
        Lion lion = new Lion("Самец", mockedFeline);

        Assert.assertEquals(lion.getKittens(), 7);
    }

    @Test
    public void testFood() throws Exception {
        var result = List.of("Мясо");
        Mockito.when(mockedFeline.getFood("Хищник")).thenReturn(result);

        Lion lion = new Lion("Самец", mockedFeline);
        Assert.assertEquals(result, lion.getFood());
    }

    @Test
    public void testSexException() {
        try {
            new Lion("тест", new Feline());
        } catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка" ,exception.getMessage());
            return;
        }
        Assert.fail("Не было исключения");

    }

}
