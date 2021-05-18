import org.junit.Assert;
import org.junit.Test;


public class Methods_Test {
    private Assert Assertions;
    private Methods methods;

    // Тест Method_1.
    @Test
    public void test_Method_1() {
        methods = new Methods();
        //1 Проверка ожидаемых значений.
        Assertions.assertArrayEquals(new int[]{2, 3, 3, 1, 7}, methods.method_1(new int[]{1, 2, 4, 4, 2, 3, 3, 1, 7}));
        //2 Проверка ожидаемых значений.
        Assertions.assertArrayEquals(new int[]{2, 2, 9, 2, 3, 3, 1, 7}, methods.method_1(new int[]{4, 2, 2, 9, 2, 3, 3, 1, 7}));
        //3 Проверка на выброс исключения о пустом подаваемом массиве.
        try {
            methods.method_1(new int[]{});
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException thrown) {
            Assert.assertEquals("Массив arr пуст", thrown.getMessage());
//            Assert.assertNotEquals("", thrown.getMessage());
        }
        //4 Проверка на выброс исключения об отсутствии в массиве цифры '4'.
        try {
            methods.method_1(new int[]{2, 3});
            Assert.fail("Expected RuntimeException");
        } catch (RuntimeException thrown) {
            Assert.assertEquals("Массив arr не содержит ни одной цифры '4'", thrown.getMessage());
//            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    // Тест Method_2.
    @Test
    public void test_Method_2() {
        methods = new Methods();
        //1 Проверка метода на True
        Assertions.assertTrue(methods.method_2(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
        //2 Проверка метода на False, цифры '1' и '4' отсутствуют в тестируемом массиве.
        Assertions.assertFalse(methods.method_2(new int[]{0, 2, 0, 0, 2, 3, 3, 0, 7}));
        //3 Проверка метода на False, цифра '4' отсутствует в тестируемом массиве.
        Assertions.assertFalse(methods.method_2(new int[]{1, 2, 0, 0, 2, 3, 0, 1, 7}));
        //4 Проверка метода на False, цифра '1' отсутствует в тестируемом массиве.
        Assertions.assertFalse(methods.method_2(new int[]{0, 2, 4, 4, 2, 3, 4, 0, 7}));
    }
}