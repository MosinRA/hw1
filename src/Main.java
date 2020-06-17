import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //замена в массиве
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"};
        change(arr1, 1, 4);
        change(arr2, 0, 2);
        //Преобразование
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
        //задача

        Box<Orange> forOrange = new Box<>();
        Box<Orange> forOrange1 = new Box<>();
        Box<Apple> forApple = new Box<>();
        Box<Apple> forApple1 = new Box<>();
        System.out.println("Задача");
        System.out.println("Пополнение фруктов: ");
        forOrange.addFruit(new Orange(), 12);
        forOrange1.addFruit(new Orange(), 12);
        forApple.addFruit(new Apple(), 8);
        forApple1.addFruit(new Apple(), 4);
        System.out.println("Коробка с апельсинами 1 весит: " + forOrange.getWeight() + " кг");
        System.out.println("Коробка с апельсинами 2 весит: " + forOrange1.getWeight() + " кг");
        System.out.println("Коробка с яблоками 1 весит: " + forApple.getWeight() + " кг");
        System.out.println("Коробка с яблоками 2 весит: " + forApple1.getWeight() + " кг");
        System.out.println("Сравнение коробок с фруктами: ");
        System.out.println("Коробка с апельсинами 1 и  Коробка с яблоками 1: " + forOrange.compare(forApple));
        System.out.println("Коробка с апельсинами 2 и Коробка с яблоками 2: " + forOrange1.compare(forApple1));
        System.out.println("Коробка с апельсинами 2 и Коробка с апельсинами 1: " + forOrange1.compare(forOrange));
        forOrange.pourTo(forOrange1);
        forApple.pourTo(forApple1);
        System.out.println("Перекладываем фрукты в одну коробку: ");
        System.out.println("Коробка с апельсинами 1 теперь весит: " + forOrange.getWeight() + " кг");
        System.out.println("Коробка с апельсинами 2 теперь весит: " + forOrange1.getWeight() + " кг");
        System.out.println("Коробка с яблоками 1 теперь весит: " + forApple.getWeight() + " кг");
        System.out.println("Коробка с яблоками 2 теперь весит: " + forApple1.getWeight() + " кг");


    }

    public static void change(Object[] arr, int n1, int n2) {
        System.out.println("Замена в массиве: " + Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println("Результат замены: " + Arrays.toString(arr));
    }

    public static <T> void asList(T[] arr) {
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Преобразование : " + alt);
    }
}

