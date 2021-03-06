import java.util.Arrays;

public class Methods {

//    Метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//    Метод возвращает новый массив, который получен путем вытаскивания из исходного массива элементов,
//    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе
//    необходимо выбросить RuntimeException.

    static int[] method_1(int[] arr) throws RuntimeException {
        if (arr.length == 0) throw new RuntimeException("Массив arr пуст");
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                k = i;
            }
        }
            if (k == 0 && arr[0] != 4) throw new RuntimeException("Массив arr не содержит ни одной цифры '4'");
            int lengthArr2 = arr.length - k - 1;
            int[] arr2 = new int[lengthArr2];
            for (int j = 0; j < arr2.length; j++) {
                arr2[j] = arr[k + 1 + j];
            }
        return arr2;
    }

//    Метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
//    то метод вернет false.

    static boolean method_2(int[] arr) throws RuntimeException {
        int one = 0;
        int four = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 4) {
                four++;
            }
        }
        return (one > 0 && four > 0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        try {
            int[] arr2 = method_1(arr);
            System.out.println(Arrays.toString(arr2));
        } catch (RuntimeException e) {
            e.printStackTrace();;
        }
        System.out.println(method_2(arr));
    }
}
