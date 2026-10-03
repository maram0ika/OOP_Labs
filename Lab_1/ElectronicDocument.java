import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;


public class ElectronicDocument {

    public static boolean isValidDate(String date) {
    DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd.MM.uuuu");

        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }


    
    private String title;
    private String format;
    private String date;

    public ElectronicDocument(String title, String format, String date) {
        setTitle(title);
        setFormat(format);
        setDate(date);
    }

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        if (title.length() <= 100) {
            this.title = title;
        }
    }

    public void setFormat(String format) {
        if (!format.isEmpty()
            && format.charAt(0) == '.'
            && !format.contains(" ")
            && format.length() < 10) {
                
                this.format = format;
        }
    }

    public void setDate(String date) {
        if (isValidDate(date)) {
            this.date = date;
        }
    }

    public void printName(String title, String format) {
        System.out.println("Documet name: " + title + format);
    }

    public long getDocumentAgeInDays() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu");

        LocalDate creationDate = LocalDate.parse(this.date, formatter);
        LocalDate currentDate = LocalDate.now();

        return ChronoUnit.DAYS.between(creationDate, currentDate);
    } 

    public boolean isOlderThan(int days) {
        return getDocumentAgeInDays() > days;
    }


}
