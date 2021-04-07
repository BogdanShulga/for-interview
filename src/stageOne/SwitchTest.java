package stageOne;

public class SwitchTest {
    public static void main(String[] args) {
        String monthString = "April";
        switch (monthString) {
            case "January"  : System.out.println("January");
//                break;
            case "February" : System.out.println("February");
//                break;
            case "March"    : System.out.println("March");
//                break;
            case "April"    : System.out.println("April");
//                break;
            case "May"      : System.out.println("May");
//                break;
            case "June"     : System.out.println("June");
//                break;
            case "July"     : System.out.println("July");
                break;
            case "August"   : System.out.println("August");
//                break;
            case "September": System.out.println("September");
//                break;
            case "October"  : System.out.println("October");
//                break;
            case "November" : System.out.println("November");
//                break;
            case "December" : System.out.println("December");
//                break;
            default         : System.out.println("Unknown");
//                break;
        }
    }
}
