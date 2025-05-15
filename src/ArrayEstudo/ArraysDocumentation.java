package ArrayEstudo;

public class ArraysDocumentation {

    public static void main(String[] args) {

        int [] anArray = {
                1,  2,  3,
                4,  5,  6,
                7,  8,  9,
                10, 11, 12
        };

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);
        System.out.println("Element at index 10: "
                + anArray[10]);
        System.out.println("Element at index 11: "
                + anArray[11]);

    } // fim da Main

    public static class MultiDimArrayDemo {
        public static void main(String[] args) {
            String[][] names = {
                    {"Mr. ", "Mrs. ", "Ms. "},
                    {"Smith ", "Jones ", "Arthur ", "Dave "},
                    {"Jr.", "Sr.", "Duque"}
            };
            // Mr. Smith Duque
            System.out.println(names[0][0] + names[1][0] + names[2][2]);
            // Ms. Jones Sr
            System.out.println(names[0][2] + names[1][1] + names[2][1]);
            // Mrs. Smith Jones
            System.out.println(names[0][1] + names[1][0] + names[1][1]);
            // Ms. Arthur Daves Jr
            System.out.println(names[0][2] + names[1][2] + names[2][0]);
        }
    } //fim do MultiDimensionalArray

    public static class ArrayCopyDemo {
        public static void main(String[] args) {
            String[] copyFrom = {
                    "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                    "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                    "Marocchino", "Ristretto"
            };

            String[] copyTo = new String[7];
            System.arraycopy(copyFrom, 0, copyTo, 0, 7);
            for (String coffee : copyTo){
                System.out.println(coffee + " ");
            }

        } // final

        static class ArrayCopyOfDemo {
            public static void main(String[] args) {
                String[] copyFrom = {
                        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                        "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                        "Marocchino", "Ristretto" };

                String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 10);
                for (String coffee : copyTo) {
                    System.out.print(coffee + " ");
                }
            }
        }
    }

}
