
public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        for (int i = 0; i < 5;i++){
            System.out.println();
            for (int j = 0; j<10;j++){
                System.out.printf("*");
            }
        }
        System.out.println();
        for(int i = 0; i<5;i++){
            System.out.println();
            for (int j = 0; j<=i; j++){
                System.out.printf("*");
            }
        }
        System.out.println();
        for (int i = 0;i<5;i++){
            System.out.println();
            for (int j = 5; j > i ; j--){
                System.out.printf("*");
            }
        }
    }
}
