import java.util.Scanner;

public class kullanicigirisisorgulama {
    public static void main(String[] args) {

        //Kullanıcı adı ve şifre ile giriş yapılır
        ////Yanlış şifre girerse, yeni şifre belirlemek istiyorsa yeni şifre eskisinden farklı olacak şekilde belirlenir

        String userName, password;
        int sec;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici adinizi giriniz : ");
        userName = input.nextLine();
        System.out.print("Sifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Basarıyla giris yaptiniz!");
        } else if(userName.equals("patika") && !password.equals("java123"))  {

            System.out.println("Sifrenizi yanlis girdiniz!");
            System.out.print("Sifrenizi sifirlamak ister misiniz?\n Evet icin 1'e Hayir icin 2'ye basiniz : ");

            sec = input.nextInt();
         if (sec==1){
             String newPassword;
             Scanner inp = new Scanner(System.in);

             System.out.print("Yeni sifrenizi giriniz : ");
             newPassword = inp.nextLine();
          if (newPassword.equals("java123")){
               System.out.println("Sifre olusturulamadi. Lutfen baska sifre giriniz!");
          }else
                System.out.println("Yeni sifre olusturuldu");

         } else if (sec==2) {
                System.out.println("Gorusmek uzere !");
             
         }
        }
        }
    }
