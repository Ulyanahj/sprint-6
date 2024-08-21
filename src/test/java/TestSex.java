import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestSex {
    private final String sex;
    private final boolean expected; // Должно быть тип boolean

    public TestSex(String sex, boolean expected) { // Должно быть тип boolean
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getKittens() {
        return Arrays.asList(new Object[][] {
                { "Самец", true },
                { "Самка", false },
        });
    }

    @Test
    public void testHasMane() throws Exception {
        var feline = new Feline(); //зависимость животные
        var lion = new Lion(sex, feline); // создали льва с полом животных
        var hasMane = lion.doesHaveMane(); // есть ли у льва грива
        assertEquals(expected, hasMane); //сверили с ОР
    }
}

