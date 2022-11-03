import java.util.Arrays;

public class Median {

    public void median(int[] array) {

        // Variable zur Speicherung des Median
        int median;

        // Variable zur Speicherung der Array-Länge
        int arrayLength = array.length;

        // sortiert das Array
        Arrays.sort(array);

        // prüft, ob die Array-Länge gerade oder ungerade ist
        if (arrayLength % 2 != 0) {
            median = array[arrayLength/2];
        }
        else {
            median = ((array[(arrayLength) / 2 - 1]) + (array[arrayLength / 2])) / 2;
        }

        // gibt den Median aus
        System.out.println("Der Median ist " + median);

    }

}