package P10_Chain_Of_Responsibility.src;

public class Main {

    public static void main(String[] args) {
        Approver primaryApprover;

        Approver automaticApprover = new AutomaticApprover();
        Approver inspectingApprover = new InspectingApproved();
        Approver manualReviewApprover = new ManualReviewApprover();

        automaticApprover.setNextApprover(inspectingApprover);
        inspectingApprover.setNextApprover(manualReviewApprover);
        primaryApprover = automaticApprover;

        ExpenseReport expenseReport = new ExpenseReport(15000,  false);
        primaryApprover.process(expenseReport);
    }
    
}
