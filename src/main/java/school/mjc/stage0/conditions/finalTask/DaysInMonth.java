package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month <= 0 || month > 12) {
            System.out.println("invalid date");
        } else {
            switch (month){
                case 2:
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        System.out.println("29");
                    } else {
                        System.out.println("28");
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                default:
                    System.out.println("30");
                    break;

            }
        }
    }
}

