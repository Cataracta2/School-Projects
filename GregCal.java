import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregCal {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        GregorianCalendar myBirthday = new GregorianCalendar(2005, Calendar.JANUARY, 6);
        int DayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int Year = cal.get(Calendar.YEAR);
        int Month = cal.get(Calendar.MONTH);
        int DayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        String Day = "";
        if (DayOfWeek == 1)
            Day = "Sunday"; else
        if (DayOfWeek == 2)
            Day = "Monday"; else
        if (DayOfWeek == 3)
            Day = "Tuesday"; else
        if (DayOfWeek == 4)
            Day = "Wednesday"; else
        if (DayOfWeek == 5)
            Day = "Thursday"; else
        if (DayOfWeek == 6)
            Day = "Friday"; else
        if (DayOfWeek == 7)
            Day = "Saturday";

        System.out.println("1 is Sunday, 2 is Monday, 3 is Tuesday, 4 is Wednesday, 5 is Thursday, 6 is Friday, 7 is Saturday");
        System.out.println(" ");
        System.out.println("Today is " + (Month + 1) + "/" + DayOfMonth + "/" + Year + " and the day of the week is " + Day);

        cal.add(Calendar.DAY_OF_MONTH,100);
        Year = cal.get(Calendar.YEAR);
        Month = cal.get(Calendar.MONTH);
        DayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        DayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        Day = "";
        if (DayOfWeek == 1)
            Day = "Sunday"; else
        if (DayOfWeek == 2)
            Day = "Monday"; else
        if (DayOfWeek == 3)
            Day = "Tuesday"; else
        if (DayOfWeek == 4)
            Day = "Wednesday"; else
        if (DayOfWeek == 5)
            Day = "Thursday"; else
        if (DayOfWeek == 6)
            Day = "Friday"; else
        if (DayOfWeek == 7)
            Day = "Saturday";
        System.out.println("The day 100 days from now is " +  (Month + 1) + "/" + DayOfMonth + "/" + Year + " and the day of the week is " + Day);

        int Year1 = myBirthday.get(Calendar.YEAR);
        int Month1 = myBirthday.get(Calendar.MONTH);
        int DayOfMonth1 = myBirthday.get(Calendar.DAY_OF_MONTH);
        int DayOfWeek1 = myBirthday.get(Calendar.DAY_OF_WEEK);
        Day = "";
        if (DayOfWeek1 == 1)
            Day = "Sunday"; else
                if (DayOfWeek1 == 2)
                    Day = "Monday"; else
                        if (DayOfWeek1 == 3)
                            Day = "Tuesday"; else
                                if (DayOfWeek1 == 4)
                                    Day = "Wednesday"; else
                                        if (DayOfWeek1 == 5)
                                            Day = "Thursday"; else
                                                if (DayOfWeek1 == 6)
                                                    Day = "Friday"; else
                                                        if (DayOfWeek1 == 7)
                                                            Day = "Saturday";
        System.out.println("My birthday is " +  (Month1 + 1) + "/" + DayOfMonth1 + "/" + Year1 + " and the day of the week is " + Day);

        myBirthday.add(Calendar.DAY_OF_MONTH, 10000);
        Year1 = myBirthday.get(Calendar.YEAR);
        Month1 = myBirthday.get(Calendar.MONTH);
        DayOfMonth1 = myBirthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("The day 10000 days from my birthday is " +  (Month1 + 1) + "/" + DayOfMonth1 + "/" + Year1);
    }
}

