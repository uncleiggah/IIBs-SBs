public class ExaminationBoard {
    String RegistrationStatus;
    String ExamCentre;
    String CandidateName;
    static String GradingPolicies;
    static int ExamYear;
    static int RegistrationFees;
    {
        System.out.println("\n AN INSTANCE INITIALIZATION BLOCK ");
        RegistrationStatus = "Pending";
        ExamCentre = "25/UG/1608/BSCS-S";
    }
    static {
        System.out.println("\n A STATIC BLOCK");
        ExamYear = 2024;
        RegistrationFees = 2000;
        GradingPolicies = "A=85-100, B= 75-84, C= 65-74";
    }
    public ExaminationBoard(String CandidateName) {
        this.CandidateName = CandidateName;
    }
}
