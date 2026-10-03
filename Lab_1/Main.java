public class Main {
    public static void main(String[] args) {

        ElectronicDocument document = new ElectronicDocument(
                "Report",
                ".pdf",
                "01.10.2026"
        );

        System.out.println("=== ElectronicDocument ===");
        document.printName(
                document.getTitle(),
                document.getFormat()
        );

        System.out.println(
                "Document age: " +
                document.getDocumentAgeInDays() +
                " days"
        );

        System.out.println(
                "Older than 1 day: " +
                document.isOlderThan(1)
        );


        TrainingDocument trainingDocument = new TrainingDocument(
                "Algorithms_lab",
                ".docx",
                "01.10.2026",
                "Sonya",
                "Algorithms",
                "10.10.2026"
        );

        System.out.println();
        System.out.println("=== TrainingDocument ===");

        trainingDocument.printTrainingInfo();

        System.out.println(
                "Overdue: " +
                trainingDocument.isOverdue()
        );

        System.out.println(
                "Days until deadline: " +
                trainingDocument.getDaysUntilDeadline()
        );


        LaboratoryWork laboratoryWork = new LaboratoryWork(
                "Lab_1",
                ".pdf",
                "02.10.2026",
                "Sonya",
                "Java",
                "15.10.2026",
                1,
                7,
                75
        );

        System.out.println();
        System.out.println("=== LaboratoryWork ===");

        laboratoryWork.printLaboratoryInfo();

        System.out.println(
                "Passed: " +
                laboratoryWork.isPassed()
        );

        System.out.println(
                "Points to pass: " +
                laboratoryWork.getPointsToPass()
        );
    }
}