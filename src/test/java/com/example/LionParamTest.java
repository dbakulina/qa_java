package com.example;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
    @RunWith(Parameterized.class)
    public class LionParamTest {
        public final String sex;
        public final boolean result;
        private ExpectedException thrown;
        @Mock
        Feline feline;
        public LionParamTest(String sex, boolean result) {
            this.sex = sex;
            this.result = result;
        }
        @Parameterized.Parameters // Пометь метод аннотацией для параметров
        public static Object[][] getTextData() {
            return new Object[][] {
                    {"Самец", true},
                    {"Самка", false},
            };
        }
        @Test
        public void isLionHaveMain() throws Exception {
            Lion lion = new Lion (sex,feline);
            assertEquals(result, lion.doesHaveMane());
        }
}
