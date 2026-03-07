package P10_Chain_Of_Responsibility.src;

public class ManualReviewApprover extends Approver{

    @Override
    public void process(ExpenseReport expenseReport){
        System.out.println("ManualReviewApprover: Expense report sent for manual review.");
    }    
}