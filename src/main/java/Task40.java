import java.time.LocalDate;

public class Task40 {
    public static void main(String[] args) {

    }
        // Birinci metot: String parametri qəbul edir
        public void process(String text) throws IllegalArgumentException {
            if (text == null) {
                throw new IllegalArgumentException("String parameter cannot be null");
            }
            System.out.println("Processing text: " + text);
        }

        // İkinci metot: LocalDate parametri qəbul edir
        public void process(LocalDate date) throws IllegalArgumentException {
            if (date == null) {
                throw new IllegalArgumentException("LocalDate parameter cannot be null");
            }
            System.out.println("Processing date: " + date);
        }

        // Üçüncü metot: Integer parametri qəbul edir
        public void process(Integer number) throws IllegalArgumentException {
            if (number == null) {
                throw new IllegalArgumentException("Integer parameter cannot be null");
            }
            System.out.println("Processing number: " + number);
        }


            }




