public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean precedes(Date other) {
        if (year < other.year) return true;
        if (year == other.year && month < other.month) return true;
        if (year == other.year && month == other.month && day < other.day) return true;
        return false;
    }

    public boolean equals(Date other) {
        return day == other.day &&
               month == other.month &&
               year == other.year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}