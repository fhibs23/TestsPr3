import java.util.*;
import java.util.Random;
public class Chat {
    private User currentUser;
    private Scanner scanner;

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setUserName() {
        scanner = new Scanner(System.in);
        System.out.println(AnswerBase.NAME.getAnswer());
        String name = scanner.nextLine();
        while (name.matches("[0-9]+") || name.equals("")) {
            System.out.println("Введи имя буквами:");
            name = scanner.nextLine();
        }
        currentUser.setName(name);

    }

    public void setUserSex() {
        scanner = new Scanner(System.in);
        System.out.println(AnswerBase.SEX.getAnswer());
        String sex = scanner.nextLine();
        while (!Objects.equals(sex, "М") && !Objects.equals(sex, "Ж")) {
            System.out.println("Введи только букву М или Ж:");
            sex = scanner.nextLine();

        }
        currentUser.setSex(sex);
    }

    public void setUserAge() {
        scanner = new Scanner(System.in);
        System.out.println(AnswerBase.AGE.getAnswer());
        String age = scanner.nextLine();
        while (!age.matches("\\d+")) {
            System.out.println("Введи возраст как целое число:");
            age = scanner.nextLine();
        }
        currentUser.setAge(Integer.parseInt(age));
    }

    public void setUserType() {
        scanner = new Scanner(System.in);
        System.out.println(AnswerBase.PHYLOSOPHY.getAnswer());
        System.out.println(AnswerBase.LOGIC.getAnswer());
        System.out.println(AnswerBase.ABOUTME.getAnswer());
        System.out.println(AnswerBase.DIFFERENT.getAnswer());
        System.out.println(AnswerBase.INTERESTINGFACTS.getAnswer());
        String type = scanner.nextLine();
        while (!type.matches("[1-5]")) {
            System.out.println("Введите цифру от 1 до 5");
            type = scanner.nextLine();
        }
        currentUser.setType(Integer.parseInt(type));
    }

    public void chatting() {
        switch (currentUser.getType()) {
            case 1:
                philosophy();
                break;
            case 2:
                logic();
                break;
            case 3:
                aboutme();
                break;
            case 4:
                different();
                break;
            case 5:
                interesting();
                break;
        }
    }

    public static String getRandomFact() {
        Random random = new Random();
        return AnswerBase.values()[random.nextInt(5) + 18].getAnswer();
    }


    private void interesting() {
        Random rnd = new Random();
        int en = rnd.nextInt(5);
        System.out.println(getRandomFact());
    }

    private void different() {
        System.out.println(AnswerBase.ASK.getAnswer());
        String str = scanner.nextLine();
        String substr1 = "книга";
        String substr2 = "читать";
        String substr3 = "слушать";
        String substr4 = "музыка";
        String substr5 = "песня";
        if (str.contains(substr1) || str.contains(substr2)) {
            System.out.println(AnswerBase.BOOK.getAnswer());
        }
        else if (str.contains(substr3) || str.contains(substr4) || str.contains(substr5)) {
            System.out.println(AnswerBase.MUSIC.getAnswer());
        } else {
            System.out.println(AnswerBase.DONOTUNDERSTAND.getAnswer());
        }
    }

    private void aboutme() {
        System.out.println(AnswerBase.ASK.getAnswer());
        String str = scanner.nextLine();
        String substr1 = "зовут";
        String substr2 = "имя";
        String substr3 = "сколько";
        if (str.contains(substr1) || str.contains(substr2)) {
            System.out.println(AnswerBase.NAME.getAnswer());
        }
        else if (str.contains(substr3)) {
            System.out.println(AnswerBase.AGE.getAnswer());
        } else {
            System.out.println(AnswerBase.DONOTUNDERSTAND.getAnswer());
        }

    }

    private void logic() {
        System.out.println(AnswerBase.ASK.getAnswer());
        String str = scanner.nextLine();
        String substr1 = "Пифагор";
        String substr2 = "аксиома";
        String substr3 = "млекопитающее";
        if (str.contains(substr1)) {
            System.out.println(AnswerBase.PIFAGOR.getAnswer());
        }
        else if (str.contains(substr2)) {
            System.out.println(AnswerBase.AKSIOMA.getAnswer());
        }
        else if (str.contains(substr3)) {
            System.out.println(AnswerBase.MAMMAL.getAnswer());
        } else {
            System.out.println(AnswerBase.DONOTUNDERSTAND.getAnswer());
        }

    }

    private void philosophy() {
        System.out.println(AnswerBase.ASK.getAnswer());
        String str = scanner.nextLine();
        String substr1 = "душа";
        String substr2 = "любов";
        String substr3 = "смысл";
        if (str.contains(substr1)) {
            System.out.println(AnswerBase.SOUL.getAnswer());
        }
        else if (str.contains(substr2)) {
            System.out.println(AnswerBase.WHATISLOVE.getAnswer());
        }
        else if (str.contains(substr3)) {
            System.out.println(AnswerBase.LIFEMEANING.getAnswer());
        } else {
            System.out.println(AnswerBase.DONOTUNDERSTAND.getAnswer());
        }

    }

}