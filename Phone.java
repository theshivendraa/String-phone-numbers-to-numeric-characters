import java.util.Scanner;

public class Phone{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=9;
       String []arr=new String[10] ;  
        for(int i=0;i<10;i++){
              arr[i]= sc.nextLine();
        }
        for(int i=0;i<arr.length;i++){

                if (arr[i].equals("one")){
                    System.out.print("1");
                }else if(arr[i].equals("double one")){
                    System.out.print("11");
                }else if(arr[i].equals("triple one")){
                    System.out.print("111");
                    
                }else if(arr[i].equals("two")){
                    System.out.print("2");
                }else if(arr[i].equals("double two")){
                    System.out.print("22");
                }else if(arr[i].equals("triple two")){
                    System.out.print("222");
                    
                }else if(arr[i].equals("three")){
                    System.out.print("3");
                }else if(arr[i].equals("double three")){
                    System.out.print("33");
                }else if(arr[i].equals("triple three")){
                    System.out.print("333");
                    
                    
                }else if(arr[i].equals("four")){
                    System.out.print("4");
                }else if(arr[i].equals("double four")){
                    System.out.print("44");
                }else if(arr[i].equals("triple four")){
                    System.out.print("444");
                    
                    
                }else if(arr[i].equals("five")){
                    System.out.print("5");
                }else if(arr[i].equals("double five")){
                    System.out.print("55");
                }else if(arr[i].equals("triple five")){
                    System.out.print("555");
                    
                    
                }else if(arr[i].equals("six")){
                    System.out.print("6");
                }else if(arr[i].equals("double six")){
                    System.out.print("66");
                }else if(arr[i].equals("triple six")){
                    System.out.print("666");
                    
                    
                }else if(arr[i].equals("seven")){
                    System.out.print("7");
                }else if(arr[i].equals("double seven")){
                    System.out.print("77");
                }else if(arr[i].equals("triple seven")){
                    System.out.print("777");
                    
                    
                }else if(arr[i].equals("eight")){
                    System.out.print("8");
                }else if(arr[i].equals("double eight")){
                    System.out.print("88");
                }else if(arr[i].equals("triple eight")){
                    System.out.print("888");
                    
                 
                }else if(arr[i].equals("nine")){
                    System.out.print("9");
                }else if(arr[i].equals("double nine")){
                    System.out.print("99");
                }else if(arr[i].equals("triple nine")){
                    System.out.print("999");
        
                    
                }else if(arr[i].equals("zero")){
                    System.out.print("0");
                }else if(arr[i].equals("double zero")){
                    System.out.print("00");
                    
                }else if(arr[i].equals("triple zero")){
                    System.out.print("000");
                    }
                    else{System.out.print("--");
                }
            } 
        }   
    }   
 
