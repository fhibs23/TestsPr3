import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();
        chat.setCurrentUser(new User());
        chat.setUserName();
        chat.setUserSex();
        chat.setUserAge();
        Scanner scanner = new Scanner(System.in);
        String str="";
        while(!Objects.equals(str, "END")) {
            chat.setUserType();
            chat.chatting();
            System.out.println("Press ANY KEY if you want to CONTINUIE our chatting " +
                    "Press END if you want to ens chatting.");
            str=scanner.nextLine();
        }

    }
}