//2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package task2;
import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        printArray(getArray());        
        printArray(bubbleSort(getArray()));
    }

    // Создание массива
    public static int[] getArray() {
        int[] myArray = new int[] { 1, 5, 4, 3, 7 };
        return myArray;
    }

    // Печать массива в консоль
    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // Сортировка массива
    static int [] bubbleSort (int[] array) {
        int i = array.length - 1;
        for (i = array.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array [j] > array [j+1])
                    toTemp (array, j, j+1);
            }
        }
        return array;
    }

     // Поменять местами элементы массива
    static void toTemp(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


// Logger logger = Logger.getLogger(program.class.getName());
// FileHandler fh = new FileHandler("log.txt");
// logger.addHandler(fh);


// SimpleFormatter sFormat = new SimpleFormatter();
// fh.setFormatter(sFormat);

}
