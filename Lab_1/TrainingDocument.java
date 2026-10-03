
public class TrainingDocument extends ElectronicDocument{
    
    private String author;
    private String subject;
    private String deadline;

    public TrainingDocumentt(String author, String subject, String deadline) {
        setTitle(author);
        setFormat(subject);
        setDate(deadline);
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
        if (author.length() <= 100) {
            this.author = author;
        }
    }

    public void setSubject(String subject) {
        if (subject.length() <= 100) {
            this.subject = subject;
        }
    }

     public void setDeadline(String deadline) {
        if (isValidDate(deadline)) {
            this.deadline = deadline;
        }

}
