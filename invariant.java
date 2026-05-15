import java.time.LocalDate;

public class Invariant {

    static class Person {
        String name;
        LocalDate born;
        LocalDate died;

        public Person(String name, LocalDate born, LocalDate died) {
            if (checkdates(born, died)) {
                this.name = name;
                this.born = born;
                this.died = died;
            } else {
                throw new IllegalArgumentException("Invalid person data");
            }
        }

        public Person(Person p) {
            this.name = p.name;
            this.born = p.born;
            this.died = p.died;
        }

        public static boolean checkdates(LocalDate born, LocalDate died) {
            if (born == null) return false;
            return (died == null || !died.isBefore(born));
        }

        public static boolean matchdates(LocalDate born, LocalDate died) {
            return born != null && died != null && born.equals(died);
        }

        @Override
        public String toString() {
            return "Person name: " + name +
                   "\nBorn: " + born +
                   "\nDied: " + died +
                   "\nIs valid person: " + checkdates(born, died) +
                   "\nBirth and death dates match: " + matchdates(born, died);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Zaryab", LocalDate.of(2000, 5, 12), null);
        Person p2 = new Person(p1);
        System.out.println(p1);
    }
}
    