public class LaboratoryWork extends TrainingDocument {

    private int labNumber;
    private int variant;
    private int grade;

    public LaboratoryWork(
            String title,
            String format,
            String date,
            String author,
            String subject,
            String deadline,
            int labNumber,
            int variant,
            int grade) {

        super(
                title,
                format,
                date,
                author,
                subject,
                deadline
        );

        setLabNumber(labNumber);
        setVariant(variant);
        setGrade(grade);
    }


    public int getLabNumber() {
        return labNumber;
    }

    public int getVariant() {
        return variant;
    }

    public int getGrade() {
        return grade;
    }


    public void setLabNumber(int labNumber) {
        if (labNumber > 0) {
            this.labNumber = labNumber;
        }
    }

    public void setVariant(int variant) {
        if (variant > 0) {
            this.variant = variant;
        }
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }


    public boolean isPassed() {
        return grade >= 50;
    }

    public int getPointsToPass() {
        if (isPassed()) {
            return 0;
        }

        return 50 - grade;
    }

    public void printLaboratoryInfo() {
        System.out.println("Document: " + getTitle() + getFormat());
        System.out.println("Author: " + getAuthor());
        System.out.println("Subject: " + getSubject());
        System.out.println("Deadline: " + getDeadline());
        System.out.println("Lab number: " + labNumber);
        System.out.println("Variant: " + variant);
        System.out.println("Grade: " + grade);
    }
}