public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Lesson 1");
        int i = 10;
        while(i>=0){
            System.out.print(i+" ");
            i--;
        }
        System.out.println();
        for(i=0;i<=10;i++){
            System.out.print(i+" ");
        }

        //Задание 2
        System.out.println();
        System.out.println("Lesson 2");

        int friday = 2;
        for (i =0; i<=31; i++){
            if (i == friday){
                System.out.println("Сегодня пятница "+ i + "-е число. Необходимо подготовить отчет");
                friday = friday+7;
            }
        }
        //Задание 3
        System.out.println();
        System.out.println("Lesson 3");
        int currentYear = 2021;
        int lastYear = currentYear - 200;
        int nextYear = currentYear + 100;
        for (i = 0;i<=nextYear;i=i+79){
            if (i>=lastYear){
                System.out.println(i);
            }
        }


    }

}