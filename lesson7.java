import java.util.Scanner;

public class lesson7 {
    static int[] maCanBo = new int[3];
    static String[] tenCanBo =new String[3];
    static String[] ngaySinhCanBo = new String[3];
    static int[] soNgayLamViecCanBo = new int[3];
    static double[] soGioLamThemCanBo = new double[3];
    static double[] luongCanBo = new double[3];
    public static void InputData(){
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<3){
            System.out.println("Enter id of employee (maCanBo) " + (i+1));
            maCanBo[i]= Integer.parseInt(sc.nextLine());
            System.out.println("Enter the name of employee " + (i+1));
            tenCanBo[i] = sc.nextLine();
            System.out.println("Enter the birth of employee " + (i+1));
            ngaySinhCanBo[i] = sc.nextLine();
            System.out.println("Enter the number of work in month " + (i+1));
            soNgayLamViecCanBo[i] = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the time work in a day " + (i + 1));
            soGioLamThemCanBo[i] = Double.parseDouble(sc.nextLine());
            luongCanBo[i] = soGioLamThemCanBo[i]*45000+soNgayLamViecCanBo[i]+35000;
            i++;
        }
        information();
    }
    public static void information(){
        System.out.printf("| %-3s | %-20s | %-20s | %-20s | %-20s | %-20s |%n","STT","HoVaTen","NgaySinh","SoNgayLV","GioLamThem","Luong");
        for(int i=0; i<maCanBo.length; i++){
            System.out.printf("| %-3d | %-20s | %-20s | %-20s | %-20s | %-20s |%n",(1+i),tenCanBo[i],ngaySinhCanBo[i],soNgayLamViecCanBo[i],soGioLamThemCanBo[i],luongCanBo[i]);
            i=i+1;
        }
    }
    public static void main(String[] args){
        InputData();
    }
}
