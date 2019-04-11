import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Managment {
    private Scanner in;
    private Game game;
    private Password password;
    private int status;
    private ArrayList<String> servis_mas;

    public Managment()
    {
        servis_mas = new ArrayList<String>();
        in = new Scanner(System.in);
        password = new Password();
        game = new Game(password);
        status = 0;
    }

    public void Start()
    {
        printMenu();
    }



    public void Stop()
    {
        in.close();
        System.exit(0);
    }





    private void printMenu() {
        System.out.println("\n\nМеню \"Менеджер паролей\" ");
        System.out.println("0. Добавить новый пароль");
        if (status!= 0) {
            System.out.println("1. Измениь существующий пароль");
            System.out.println("2. Получить существующий пароль");
            System.out.println("3. Вывод сервисов");
        }
        System.out.println("4. Выход");
        System.out.println("Введите число:");
        readMenu();
    }

    private void readMenu(){
        in = new Scanner(System.in);
        int num = in.nextInt();
        if (((num != 0) &&(num != 4)) &&(status == 0))
            printMenu();
        else
        if (num > 4)
            printMenu();
        else
            ToDo(num);

    }

    private void ToDo(int index)
    {
        switch (index){
            case 0:
                addPassword();
                printMenu();
                break;
            case 1:
                editPassword();
                printMenu();
                break;
            case 2:
                getPassword();
                printMenu();
                break;
            case 3:
                printAllServis();
                printMenu();
                break;
            case 4:
                Stop();
        }
    }

    private void getPassword() {
        String servis = readServis();
        System.out.println("Для получения пароля вам нужно угадать 3 символа (не обязательно разные)");
        if (game.inputServis(servis)) {
            while (game.getPassword() == null) {
                System.out.println("Введит символ: ");
                String letter = in.next();
                boolean fl = game.inputLetter(letter);
                if (fl)
                    System.out.println(password.getString(servis));
                else {
                    System.out.println("Такого символа нет!");
                    return;
                }


            }
            System.out.println("Пароль такой:");
            System.out.println(game.getPassword());
            printMenu();
        }
        else {
            System.out.println("Такого сервиса нет!");
            printMenu();
        }

    }

    private void editPassword() {
        String servis = readServis();
        String pasword = readPassword();

        boolean fl = password.Edit(servis,pasword);
        if (fl) {
            printMenu();
        }
        else
        {
            System.out.println("Невозможно изменить пароль. Для этого сервиса пароль не существуетн");
            printMenu();
        }
    }


    public int getStatus() {
        return status;
    }

    private void addPassword() {
        String servis = readServis();
        servis_mas.add(servis);
        String pasword = readPassword();

        boolean fl = password.addPassword(servis, pasword);
        if (fl) {
            status++;
            printMenu();
        }
        else
        {
            System.out.println("Невозможно создать пароль. Для этого сервиса пароль уже задан");
            printMenu();
        }
    }

    private String readServis()
    {
        printAllServis();
        in = new Scanner(System.in);
        System.out.println("Введит сервис: ");
        String servis = in.next();
        return servis;
    }

    private String readPassword()
    {
        in = new Scanner(System.in);
        System.out.println("Введит пароль: ");
        String pasword = in.next();
        if (pasword.length() < 4){
            System.out.println("Слишком короткий пароль: ");
            pasword = readPassword();
        }

        return pasword;
    }

    private void printAllServis()
    {
        System.out.println("На данный момент в системе сохранены пароли для: ");
        if (servis_mas.size() != 0)
            for(Object servis : servis_mas)
                System.out.println(servis);
        else
            System.out.println("Список сервисов пуст");

    }

}
