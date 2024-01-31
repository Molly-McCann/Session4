
// Molly McCann 
// 01.29.2024

public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
        	// case value1:
            case 1:
            	// Code to execute when expression matches value1
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
                break;
        }
    }
}

// We expect this to print It's Wednesday and only that because of the break 
