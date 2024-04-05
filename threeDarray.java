public class threeDarray {
    public static void main(String[] args) {
        int[][][] threeDarray = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } } };

        for (int i = 0; i < threeDarray.length; i++) {
            for (int j = 0; j < threeDarray[i].length; j++) {
                for (int k = 0; k < threeDarray[i][j].length; k++) {
                    System.out.print(threeDarray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}