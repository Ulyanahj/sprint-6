import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestFeline {

    @Test
    public void testGetFamily() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }


    @Test
    public void testGetKittens() {
        Feline feline = new Feline();

        // Проверяем, что метод getKittens возвращает ожидаемое значение
        Assert.assertEquals(feline.getKittens(1), 1);
    }

    @Test
    public void testGetKittensNoParams() {
        Feline feline = new Feline();
        // Проверяем, что метод getKittens возвращает ожидаемое значение
        Assert.assertEquals(feline.getKittens(), 1);
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(feline.eatMeat(),  List.of("Животные", "Птицы", "Рыба"));
    }
}




