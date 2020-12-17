public class DateClass3_14 {
    /*
    *( Date Class) Create a class called Date that includes three instance variables—a month (type
a day (type int ) and a year (type int ). Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct. Provide a set and a get method for each
instance variable. Provide a method displayDate that displays the month, day and year separated
by forward slashes ( / ). Write a test app named DateTest that demonstrates class Date ’s capabilities.*/
    private int year;
    private int month;
    private int day;

    public DateClass3_14(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

//    public String displayDate() {
////        return month + "/" + day + "/" + "/" + year;
//        System.out.printf("%d/%d/%d", getMonth(), getDay(), getYear());
//    }
}


