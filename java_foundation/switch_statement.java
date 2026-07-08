//you cannot use java keywords as filename Ex.switch

//3 ways of giving the output
//1. printing (using System.out.println) 2.storing it in the 3rd variable and printing it later 3.returning the value to the function nad here to the switch statement  


// public class switch_statement{
//     public static void main(String args[]){
//         int n=5;

//         switch(n){
//             case 1: System.out.println("Monday");
//             break;

//             case 2: System.out.println("Tuesday");
//             break;

//             case 3: System.out.println("Wednesday");
//             break;

//             case 4: System.out.println("Thursday");
//             break;

//             case 5: System.out.println("Friday");
//             break;

//             case 6: System.out.println("Saturday");
//             break;

//             case 7: System.out.println("Sunday");
//             break;

//             default:System.out.println("Invalid number");
//             break;

//        }
//     }
// }


//UPDATED VERSION OF SWITCH (Instead of : use ->, no break here)

// public class switch_statement{
//     public static void main(String args[]){

//         String day="sunday";

//         switch(day){
//             case "Monday" -> System.out.println("6 am");

//             case "Tuesday" -> System.out.println("8 am");

//             case "Wednesday" -> System.out.println("5 am");

//             case "Thursday" -> System.out.println("5 am");

//             default -> System.out.println("10 am");
//         }
//     }
// }

//Another method =>storing the value and printing it later


// public class switch_statement{
//     public static void main(String args[]){

//         String month="January";
//         String result=" "; //if you just leave the variable like this after initializing it will give error....do initialze with the empty string, if int then initialize it with 0.
       
//         switch(month){
            
//             case "January" -> result="Starting month of the year";

//             case "Febraury" -> result="Second month of the year";

//             case "March" -> result="Starting of summer";

//             default -> result="Its a month";
//         }

//         System.out.println(result);
//     }
// }

//returning the value to the switch and storing it in the variable and printing (no need to write the return keyword it will giv ethe eror)

// public class switch_statement{
//     public static void main(String args[]){

//         String month="Febraury";
//         String result=" "; //if you just leave the variable like this after initializing it will give error....do initialze with the empty string, if int then initialize it with 0.
       
//         result = switch(month){
//             case "January" -> "Starting month of the year";
//             case "Febraury" -> "Second month of the year";
//             case "March" -> "Starting of summer";
//             default -> "Its a month";
//         };

//         System.out.println(result);
//     }
// }

// keeping : and using yield

public class switch_statement{
    public static void main(String args[]){

        String month="Febraury";
        String result=" "; //if you just leave the variable like this after initializing it will give error....do initialze with the empty string, if int then initialize it with 0.
       
        result = switch(month){
            case "January" : yield "Starting month of the year";
            case "Febraury" : yield "Second month of the year";
            case "March" : yield "Starting of summer";
            default : yield "Its a month";
        };

        System.out.println(result);
    }
}