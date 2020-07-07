import java.util.Scanner;

public class BTTinhSum2DuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Row mảng : ");
        int row = scanner.nextInt();
        int column = row;
        int[][] array = new int[row][column];
        System.out.println();
        System.out.println("Mảng vừa tạo : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        int sum1 =0;
        int sum2 =0;
        for (int i=0;i<array.length;i++){
            for (int j=i;j<array[i].length;j++){
                sum1 += array[i][j];
                break;
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=array[i].length-1-i;j>=0;j--){
                sum2 += array[i][j];
                break;
            }
        }

        System.out.println();
        System.out.println("Tổng của đường chéo thứ nhất là : "+sum1);
        System.out.println("Tổng của đường chéo thứ hai là : "+sum2);
    }
}
