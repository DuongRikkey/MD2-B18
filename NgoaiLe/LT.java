//package NgoailevaxulytrongJava;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class LT {
// //Né ngoại lệ:throws
// //Ném ngoại lệ:throw
//
////Cách lệnh về catch xử lý các ngoại lệ nếu có
////Finally thực hiện các thao tác sau đó kể cá có ngoại lệ hay ko ngoại lệ
////Có thể ném ngoại lệ (throw) bằng cách cho lớp đấy kế thừa lớp Exception
////Ngoại lệ ko có sẵn phải custom
//
////1.Khái niệm là các lỗi phát sinh trong quá trình chạy chương trình làm chương trình bị dừng đột ngột
////2.Các lỗi thường gặp
////-Lỗi cú pháp(Lỗi compile code,lỗi biên dịch)
////-Yêu cầu nắm vững lý thuyết JAVA
////-Lỗi trong khi chạy chương trình(Lỗi runtime)--Có cách xử lý
////-Lỗi logic --Yêu cầu kinh nghiệm là các lỗi khó phát hiện vị trí lỗi và nguyên nhân là do logic xây dựng sai
////-Ngoại lệ trong Java
////-Lỗi:(OutOFmemory),Stack(OverFlow-ngăn xếp bị đầy)// liên quan đến hệ thống ko thể sửa chữa được
////Exception(Ngoại lệ)
////1.Runtime lỗi lq đến RT
////2.IOExeption lỗi do người nhập vào
////Lỗi chia cho không
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        System.out.println("Nhập tuổi");
//////        int age = sc.nextInt();//lỗi ép kiểu từ String về int
//////        System.out.println(age);
////          int n = Integer.parseInt(sc.nextLine());//Lỗi numberFormatException
//////        int[] arr=new int[2];
//////        arr[2]=100;//Lỗi truy cập phần tử mảng k hợp lệ
////      int a=5;
////      int b=0;
////      int c=a/b;
////        System.out.println(c);//Lỗi chia cho không(ArithimeticException);
//       //Cả 2 thằng lỗi và ngoại lệ đều kia throwable
//        //Interface Throwable có 2 thằng Error và Exception(Checked và Unchecked)
//        //Checked ktra dc
//        //là những lỗi do mất mạng,người nhập vào cần được xử lý để trành dừng chương trình
//        //Unchecked: khong ktra dc là, những lỗi không phải xử lý nó(Ko thể sửa chửa được chia cho 0, nhập vào vị trí ngoài mảng)
//
//        //Xử lý ngoại lệ trong JAVA
//        //Né ngoại lệ trao quyền xử lệ ngoại lệ cho đối tượng khác
//
//
//        //Xử lý ngoại lệ ở đây
////
////        try {
////            //Khối code có thể sinh ra ngoại lệ
////            getFile("student.txt");
////            System.out.println("Nếu ko có lỗi xảy ra thì chạy tiếp");
////        }
////        catch (FileNotFoundException f){
////            // xử lý ngoại lệ file not found
////            System.err.println("ko thay file");
////        }
////        catch (IOException e){
////            //Khối code xử lý néu lỗi
////            //Thường cho nhập dữ liệu ko đúng
////            e.printStackTrace();
////        }finally {
////            //Khối code thực thi dù có lỗi hay ko có lỗi xảy ra
////            System.out.println("Khối lênhk finally");
//          // Ưngs dụng bài toán Number fỏ
//
////
////        }
////        // Try catch ko bị dừng chương trình và sẽ tiếp tục thực thi chức năng khác
////        System.out.println("Tiếp tục thực thi các chức năng khác");
//        //Ung dung vào bài toán number format
////        boolean check=true;
////        while (check){
////            //yêu cầu người dùng nhập 1 số
////            try {
////                int a=Integer.parseInt(sc.nextLine());
////                //Lưu  trữ phím enter trong bộ nhớ nếu dùng NextIn
////                // Có thể ném ra ngoại lệ
////                // Nếu nhập chữ thì sẽ ra lỗi InputMismatchException
////                //Nếu phát sinh lỗi thì sẽ ko thực thi 2 dòng code bên dưới
////                System.out.println("Gía trị bàn vừa nhập là"+a);
////                check=false;
////            }
////            //Tại sao in ra vô hạn lần dòng lỗi này
////            //NumberFormatException có thể dùng Exception e
////            catch(NumberFormatException e){
////                System.err.println("Xin hay nhập lại, giá trị vừa nhập ko phải số");
//////                e.printStackTrace();
////            //Qúet thằng tổng thì sẽ mất thời gian hơn khi bắt chuẩn được thằng con khi có chủ đề sẽ gọi gọn phạm vi tìm kiếm giúp quá triình code tinh gọn nhanh hơn
//               //2 điều kiện tạo thành 1 tam giác 2 cạnh bất kỳ có tổng lớp hon cạnh con lại,
//        System.out.println("Tự tạo Hãy nh");
//            }
//
//
//
//
//        }
//
//
//
//
//
//    }//Né ngoại lêk
//    public static void getFile(String filename) throws IOException {
//        // né ngoại lệ ko xử lý tại ví trí đang đứng
//        File file = new File(filename);
//        if(file.exists()){
//            //Ktra xem file tồn tại ko
//            Files.copy(new FileInputStream(file), Paths.get("source.txt"));
//            //copy nội dung của 1 file đến 1 file khác
//        }
//    }
//
//
//
//}
//
//public void main() {
//}
