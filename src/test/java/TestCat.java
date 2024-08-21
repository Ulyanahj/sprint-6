import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    Feline mockedFeline = Mockito.mock(Feline.class);

    @Test
    public void testGetSound() {
        Cat cat = new Cat(mockedFeline);
        Assert.assertEquals(cat.getSound(), "Мяу");


    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(mockedFeline);
        var result = List.of("XERNYA");
        Mockito.when(mockedFeline.eatMeat()).thenReturn(result);
        Assert.assertEquals(cat.getFood(), result);
    }
}