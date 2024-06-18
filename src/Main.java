import com.sun.source.tree.NewClassTree;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("2 + 3");
        System.out.println(2 + 3);

        int speed = 17;


        double d = 6.5;
        String name = "Petya";

        System.out.println(name + " was driving at speed " + speed);
        int eaters = 5;

        int water = 3000;
        int potatoes = 5;
        int chicken = 6;
        int spices = 10;

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров(а) воды");
        System.out.println((potatoes / eaters) + " картофелин(а/ы)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ки/ка) специй");


        System.out.println("Hello");

       // int x = -5;
      // if (x > 0) {
       //     System.out.println("X положительный");
       // } else {
       //     System.out.println("X не положительный");
       // }

       // System.out.println("Bye");
///////////////////////////////////////////////////////////////////////////////////////////////////////

        /*   xndir  */

        int amount = 50000;
        boolean isRegistered = true;

        int percent;
        if (isRegistered) {
            percent = 3;
        } else {
            percent = 1;
        }
        System.out.println(percent);

        // Կամ
        // тернарный оператор

        //int percent = !isRegistered ? 3 : 1;
        //System.out.println(percent);

        int bonus = amount * percent / 100;

        if (bonus > 500) {
            bonus = 500;

        }
        System.out.println("Итоговый бонус: " + bonus);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////Homework/////////////
        //Задание 2
        //tarberak 1

        int balance = 100;
        int addedAmount = 1100;


        if (addedAmount + balance > 1000) {
            bonus = addedAmount / 100;
        }
        if (addedAmount + balance < 1000) {
            bonus = 0;

        }
        int clientBalance = balance + bonus + addedAmount;
        System.out.println("Итоговый счёт клиента:" + clientBalance);

        ///////////////////////////////////////////////////
        //Tarberak 2

        int inBalance = 100; //у клиента на счету //current balance
        int rechargeInBalance = 1100;// Сумма пополнения


        if (rechargeInBalance > 1000) {
            bonus = 1100 / 100;
            if (rechargeInBalance < 1000) {
                bonus = 0;

            }
        }
        int totalBalance = inBalance + rechargeInBalance + bonus;
        System.out.println("Итоговый счёт клиента " + totalBalance + " руб.");
        System.out.println("Бонусные рубли " + bonus + " руб.");


/////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////Задание 1

        int ticket = 13676; // Стоимость билета
        int miles = ticket / 20;// Количество миль

        System.out.println("Количество миль " +   miles);
//////////////////////////////////////////////////////////////////////////////////////////////


        //////// Class



       //CalcService service = new CalcService();
       //int myMax = service.max(5, 6);
      // System.out.println(myMax);

              //kam


       // CalcService service = new CalcService();
       // int x = 5;
        //int y = 6;
      //  int myMax = service.max(x,  y );
        //System.out.println(myMax);


        CalcService service = new CalcService();


         System.out.println();
         System.out.println(("5 /6"));
         System.out.println(service.max(5, 6));

        System.out.println();
        System.out.println("10 /10");
        System.out.println(service.max(10, 10));

        System.out.println();
        System.out.println("-10 / -20");
        System.out.println(service.max(-10, -20));






    }
}
