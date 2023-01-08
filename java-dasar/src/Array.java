public class Array {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Elang";
        stringArray[1] = "Bayu";
        stringArray[2] = "Segara";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] namaNama = {
                "Elang", "Bayu", "Segara"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5
        };

        arrayInt[0] = 0;
        namaNama[0] = null;

        System.out.println(arrayInt.length);

        String[][] members = {
                {"Wiwit", "Widowati"},
                {"Elang", "Segara"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
