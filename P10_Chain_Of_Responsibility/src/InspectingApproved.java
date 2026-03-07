package P10_Chain_Of_Responsibility.src;

public class InspectingApproved extends Approver{
    private static final double INSPECTING_APPROVAL_THRESHOLD = 400.0;

    @Override
    public void process(ExpenseReport expenseReport){
        if(expenseReport.getExpenses() <= INSPECTING_APPROVAL_THRESHOLD && expenseReport.isPlanned()){
            System.out.println("InpectingApprover: Expense report approved after detailed automatic review.");
        }
        else{
            System.out.println("InspectingApprover: Cannot approve. Sending to next approver.");
            super.process(expenseReport);
        }
    }
}