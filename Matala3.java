
    import java.util.Scanner;
    public class Matala3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int number_of_menu;
            do {
                System.out.println("""
                        Please enter the exercise number do you want to run:
                        1 - Check if array if permutation to another
                        2 - Check if a string is 2 words merged together
                        3 - Count specific words according to the first and last letter
                        0 - To exit""");
                number_of_menu = in.nextInt();

                if ((number_of_menu > 3) || (number_of_menu < 0)) {
                    System.out.println("Error");

                } else if (number_of_menu == 1) {

                    System.out.println("please enter the size of the first array ");
                    int number_of_Members1 = in.nextInt();
                    int[] firstArray = new int[number_of_Members1];

                    for (int i = 0; i < firstArray.length; i++) {

                        System.out.println("please enter the " + (number_of_Members1--) +
                                " values of the first array");

                        firstArray[i] = in.nextInt();

                        System.out.println();
                    }

                    System.out.println("please enter the size of the second array ");
                    int number_of_Members2 = in.nextInt();
                    int[] secondArray = new int[number_of_Members2];

                    for (int i = 0; i < secondArray.length; i++) {

                        System.out.println("please enter the " + (number_of_Members2--) +
                                " values of the first array");

                        secondArray[i] = in.nextInt();
                        System.out.println();
                    }

                    if (checkNumbers(firstArray, secondArray)) {
                        System.out.println("Tow arrays are a permutation of each other " + '\n' );

                    } else
                        System.out.println("Tow arrays are not a permutation of each other " + '\n');


                    }else if (number_of_menu == 2) {

                    System.out.println("Please enter the first word");
                    String arrayWord1 = in.next();

                    System.out.println("Please enter the second word");
                    String arrayWord2 = in.next();

                    System.out.println("Please enter a string");
                    String stringWord = in.next();

                    if (checkLetters(arrayWord1, arrayWord2, stringWord)) {
                        System.out.println("Merged" + '\n');
                    } else {
                        System.out.println("No Merged" + '\n');


                    }


                    }else if (number_of_menu == 3) {
                    in.nextLine();
                    System.out.println("please enter a sentence ");
                    String sentence = in.nextLine();

                    System.out.println("please enter the first letter ");
                    char first = in.next().charAt(0);

                    System.out.println("please enter the second letter ");
                    char last = in.next().charAt(0);

                    System.out.println(wordsPlay(sentence, first, last) +
                            " words starting with " + first +
                            " and ending with " + last + '\n');


                }

                }while (number_of_menu != 0);
                 System.out.println("Good Bye");

        }


         //function1
        public static boolean checkNumbers(int[] number, int[] number2) {
            boolean testNumbers = false;

            for (int i = 0; i < number.length; i++) {
                int j = 0;
                for (; j < number2.length; j++) {

                    if (number[i] == number2[j]) {
                        testNumbers = true;
                        number2[j] = 0;
                        break;
                    }else
                        testNumbers = false;
                }

                if (!testNumbers) {
                    break;

                }
            }

            if (number.length != number2.length) {
                testNumbers = false;
            }
            return testNumbers;

        }


        //function2
        public static boolean checkLetters(String arrayWord1, String arrayWord2, String word) {
            boolean testWords = false;
            int checkNum1 = 0 , checkNum2 = 0;

            for (int i = 0; i < word.length(); i++) {

                if((checkNum1 < arrayWord1.length()) &&
                        (arrayWord1.charAt(checkNum1) == word.charAt(i))){
                    testWords = true;
                    checkNum1++;

                }else if ((checkNum2 < arrayWord2.length()) &&
                        (arrayWord2.charAt(checkNum2) == word.charAt(i))){
                    testWords = true;
                    checkNum2++;

                }else {
                    testWords = false;
                }
            }
            return testWords;
        }


        //function3
        public static int wordsPlay(String sentence ,char first, char last ) {
            int count= 0;
            int start= 0;

            for (int i = 0; i < sentence.length(); i++ ) {


                if ((sentence.charAt(i)== ' ')) {
                    if (sentence.charAt(start) == first && sentence.charAt(i - 1) == last) {
                        count++;
                    }
                    start = i+1;
                }
                if (i == (sentence.length()-1)) {
                    if (sentence.charAt(start) == first && sentence.charAt(i) == last){
                        count++;
                    }
                }
            }
            return count;
        }
    }

                   //207402223







