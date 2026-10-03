import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TrainingDocument extends ElectronicDocument {

    private String author;
    private String subject;
    private String deadline;

    public TrainingDocument(
            
        
            String title,
            String format,
            String date,
            String author,
            String subject,
            String deadline) {

        super(title, format, date);

        setAuthor(author);
        setSubject(subject);
        setDeadline(deadline);
    }

    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setAuthor(String author) {
        if (author != null && author.length() <= 100) {
            this.author = author;
        }
    }

    public void setSubject(String subject) {
        if (subject != null && subject.length() <= 100) {
            this.subject = subject;
        }
    }

    public void setDeadline(String deadline) {
        if (isValidDate(deadline)) {
            this.deadline = deadline;
        }
    }
    
    public boolean isOverdue() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.uuuu");

        LocalDate deadlineDate =
                LocalDate.parse(this.deadline, formatter);

        LocalDate currentDate = LocalDate.now();

        return deadlineDate.isBefore(currentDate);
    }

    public long getDaysUntilDeadline() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd.MM.uuuu");

        LocalDate deadlineDate =
                LocalDate.parse(this.deadline, formatter);

        LocalDate currentDate = LocalDate.now();

        return ChronoUnit.DAYS.between(currentDate, deadlineDate);
    }

    public void printTrainingInfo() {
        System.out.println("Document: " + getTitle() + getFormat());
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Deadline: " + deadline);
    }

}