import java.util.Scanner;


    public class PemilihanPercobaan3_02{
        public static void main (String[] args){
            char operator;
            float number1, number2, result;

            //create an object of Scanner Class
            Scanner input = new Scanner (System.in);

            //ask user to enter operator
            System.out.println("Chosee an operator: +, -, *, /");
            operator=input.next().charAt(0);
            
            //ask user to enter numbers
            System.out.println("enter first number");
            number1 = input.nextFloat();

            System.out.println("angka kedua");
            number2 = input.nextFloat();

            switch (operator){

                //PERFORM PENAMBAHAN
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + "+" + number2 + "=" + result);
                    break;
                    
                    //PERFORM PENGURANGAN
                    case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + '-' + result);
                    break;
                    
                    //PERFORM PERKALIAN
                    case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + '*' + result);
                    break;

                    //PERFORM PEMBAGIAN
                    case '/':
                    result = number1 / number2;
                    System.out.println(number1 + "/" + number2 + '/' + result);
                    default:
                    System.out.println("error coba lagi");
                    break;
                }
                input.close();
            }
        }
    

