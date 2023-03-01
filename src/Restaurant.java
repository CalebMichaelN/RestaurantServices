import java.util.Scanner;


public class Restaurant {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean quit= false;
        int sum=0;
      boolean makePayment=true;
        int porridge=150,chapatiBeef=450,ugaliBeef=400,FriesKuku=600,CokeSoda=100,Delmontejuice=250;
        String order="";


        do{
            System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.Porridge"+"\t\t"+"150");
            System.out.println("2.ChapatiBeef"+"\t"+"450");
            System.out.println("3.ugaliBeef"+"\t\t"+"400");
            System.out.println("4.FriesKuku"+"\t\t"+"600");
            System.out.println("5.cokeSoda"+"\t\t"+"100");
            System.out.println("6.DelmonteJuice"+"\t\t"+"250");
            System.out.println("7.Quit");
            System.out.println(" Make your payment using mobile till number 4450 ");

            int choice=input.nextInt();

            switch(choice){
                case 1:System.out.println("Porridge"+"\n");
                    sum=sum+porridge;
                    order=order.concat("porridge"+"\n");

                    break;
                case 2:
                    System.out.println("ChapatiBeef");
                    sum=sum+chapatiBeef;
                    order=order.concat("ChapatiBeef"+"\n");

                    break;
                case 3:
                    System.out.println("ugaliBeef");
                    sum=sum+ugaliBeef;
                    order=order.concat("ugaliBeef"+"\n");
                    break;
                case 4:
                    System.out.println("FriesKuku");
                    sum=sum+FriesKuku;
                    order=order.concat("FriesKuku"+"\n");
                    break;
                case 5:
                    System.out.println("CokeSoda");
                    sum=sum+CokeSoda;
                    order=order.concat("CokeSoda"+"\n");
                    break;
                case 6:
                    System.out.println("DelmonteJuice");
                    sum=sum+Delmontejuice;
                    order=order.concat("DelmonteJuice"+"\n");
                    break;
                case 7:
                    quit=true;

                default:
                    System.out.println("Wrong input");
            }

        }while(!quit);

        System.out.println("Your Orders are:\n"+order);
        System.out.println("Your total bill="+sum);


        System.out.println("*************Thankyou for using our services ,,,You are welcome Again*********");





    }

}