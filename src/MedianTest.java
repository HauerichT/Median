public class MedianTest {

    public static void main(String[] args) {

        // Testarrays
        int[] array1 = {12, 16, 2, 63, 55, 8};
        int[] array2 = {42, 7, 543, 77, 87, 876, 143};

        // Instanziierung eines neuen Median-Objektes
        Median median = new Median();

        // Aufruf der Methode median um den Median der Arrays array1 und array2 zu berechnen
        System.out.println("Der Median von array1 ist: " + median.median(array1));
        System.out.println("Der Median von array2 ist: " + median.median(array2));

    }

}
