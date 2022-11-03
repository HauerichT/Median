public class MedianTest {

    public static void main(String[] args) {

        int[] array1 = {12, 16, 2, 63, 55, 8};
        int[] array2 = {42, 7, 543, 77, 87, 876, 143};

        // Instanziierung eines neuen Median Objektes
        Median median = new Median();

        // aufruf der Methode median zur Berechnung des Median der Arrays array1 und array2
        median.median(array1);
        System.out.println("-----------");
        median.median(array2);

    }

}
