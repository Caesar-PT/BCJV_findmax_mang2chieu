public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 9, 6},
                {7, 8, 5},
        };
        int x = 0;
        int y = 0;
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]){
                    x = i;
                    y = j;
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Phần tử lớn nhất có giá trị là %d, tọa độ %d, %d", max, x, y);
    }
}
