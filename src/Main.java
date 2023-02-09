import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
                while(true){
                    System.out.println("\n Enter three numbers: 0 < your number < 10");
                    int a = scn.nextInt();
                    if (a<0){
                        System.out.println("Err");
                        return;
                    }if(a>10){
                        System.out.println("Err");
                        return;
                    }
                    int b = scn.nextInt();
                    if(b<0){
                        System.out.println("Err");
                        return;
                    }if(b>10){
                        System.out.println("Err");
                        return;
                    }
                    int c= scn.nextInt();
                    if(c<0){
                        System.out.println("Err");
                        return;
                    }if(c>10){
                        System.out.println("Err");
                        return;
                    }
                    System.out.println("\n Enter two operators: (+,-); (-,+);(*,-)(/,*)");

                    char op = scn.next().charAt(0);
                    char op1 = scn.next().charAt(0);
                    int result;

                    switch (op) {
                        case '+' -> {
                            result = a + b - c;
                            if (op1 != '-'){
                                System.out.println("Err! The second operator must be (-)");
                                return;
                            }
                        }

                        case  '-'-> {
                            result = a - b + c;
                            if (op1 != '+'){
                                System.out.println("Err! The second operator must be (+)");
                                return;
                            }
                        }
                        case  '*'-> {
                            result = a * b- c;
                            if (op1 != '-'){
                                System.out.println("Err! The second operator must be (-)");
                                return;
                            }
                        }
                        case  '/'-> {
                            result = a / b* c;
                            if (op1 != '*'){
                                System.out.println("Err! The second operator must be (*)");
                                return;

                            }
                        }
                        default-> {
                            System.out.println("Err!");
                            return;
                        }
                    }
                    System.out.print("=" + result);

                }
    }
}




