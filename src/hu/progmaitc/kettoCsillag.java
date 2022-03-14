package hu.progmaitc;

public class kettoCsillag {

    public static void main(String[] args) {

        /*int hp1 = 150, ap1 = 85;
        int hp2 = 170, ap2 = 75;


        do {
            hp1 = hp1 - ap2;
            hp2 = hp2 -  ap1;
        } while (hp1 > 0 && hp2 > 0);


        if (hp1 > 0){
            System.out.println("Győztes az első medeve");
        } else if (hp1 == 0 && hp2 == 0) {
            System.out.println("döntetlen");
        } else {
            System.out.println("Győztes a második medeve");
        }*/
        /* int year = 1999;
        if (year > 1582) {
            if (year % 4 == 0 && year % 400 == 0) {
                System.out.println("Szökőév");
            } else if (year % 100 == 0){
                System.out.println("Nem szökőév");
            } else if (year % 4 == 0) {
                System.out.println("Szökőév");
            } else {
                System.out.println("Nem szökőév");
            }
        }   else {
            System.out.println("Nem szökőév");
        }*/


        /*int count = 0;
        int  number = Integer.MAX_VALUE;
        for (int i= 0; i < number ; i++){
            if ( number % (i+1)  == 0){
                count++;
            }


        }
        System.out.println("Osztok száma : " + count);*/

        /*int count = 0;
        int  number = 2147483647;
        for (long i = 1; i <= number ; i++){
            if ( number % i == 0){
                count++;
            }

        }

        if (count == 2) {
            System.out.println("Prím");
        } else {
            System.out.println("Nem prím");
        }*/

        /*int n1 = 5432;
        int n2 = 2345;
        int common = 0;

        for (int i = 1; i<= n2 || i<= n1; i++){
            if ( n1 % i == 0 && n2 % i == 0) {
                common = i;
            }

        }
        System.out.println("A legnagyobb közös osztó:" + common);
    }*/


     /*Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot!");
        int szam1 = scanner.nextInt();
        System.out.println("Kérek még egy számot!");
        int szam2 = scanner.nextInt();

       if (szam2 == 0 ){
           System.out.println(" Nullával nem osztunk!");
       }else{
           System.out.println(szam1/szam2);
        }*/


       /* int number =-10;
        if (number > 0){
            System.out.println(number-1);;
        }else{
            System.out.println(number);
        }*/

        /*int number = -10;
        if (number <0){
            System.out.println("Negativ");
        }else if (number > 0){
            System.out.println("pozitiv");
        }else{
            System.out.println("nulla");
        }*/

      /*  String light1 = "Piros";
        if (light1.equals("zöld")){
            System.out.println("SZABAD");
        } else if (light1.equalsIgnoreCase("sárga")){
            System.out.println("LASSITS!");
        } else if (light1.equalsIgnoreCase("piros")){
            System.out.println("MEGÁLLJ!");
        }else{
            System.out.println("NEM TUDOM");
        }*

       */
        /*char[] chars = {'+', '-', '*', '/', '%'};


        if (chars.length >= 2) {
            char first = chars[0];
            chars[0] = chars[chars.length - 1];
            chars[chars.length - 1] = first;
        } else  if (chars.length == 1){
            System.out.println("no change in order");
        } else {
            System.out.println(" tool short");
        }

        String begin = "[";
        String end = "]";
        String answer = "";


        System.out.print(begin);

        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1){
                answer = "" + chars[i];
                System.out.print(answer);
            } else {
                answer = chars[i] + ", ";
                System.out.print(answer);
            }
        }

        System.out.print(end);*/

        /*int[] numbers = {2, 1, -4, 3};


        if (numbers.length >= 2 && numbers[0] > numbers[1]) {
            if (numbers.length >= 2) {
                int first = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = first;
            } else if (numbers.length == 1) {
                System.out.println("no change in order");
            } else {
                System.out.println(" tool short");
            }
        }


        String begin = "[";
        String end = "]";
        String answer = "";


        System.out.print(begin);

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                answer = "" + numbers[i];
                System.out.print(answer);
            } else {
                answer = numbers[i] + ", ";
                System.out.print(answer);
            }
        }

        System.out.print(end);*/

        /*int[] oldNumbers = {-33, 66, 42, -13, 54, 89};
        int newElement = 0;
        int[] newNumbers = new int[oldNumbers.length + 1];

        for (int i = 0; i < newNumbers.length; i++){
            if (i < newNumbers.length - 1){
                newNumbers[i] = oldNumbers [i];
            } else {
                newNumbers[i] = newElement;
            }
        }

        String begin = "[";
        String end = "]";
        String answer = "";


        System.out.print(begin);

        for (int i = 0; i < newNumbers.length; i++) {
            if (i == newNumbers.length - 1) {
                answer = "" + newNumbers[i];
                System.out.print(answer);
            } else {
                answer = newNumbers[i] + ", ";
                System.out.print(answer);
            }
        }
        System.out.print(end);
*/


    }

}
