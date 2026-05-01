package P12_Proxy_p5.src;

//RealSubject
public class RealMedicalRecord implements MedicalRecord{

    private String patientName;
    private String diagnosis;
    private String prescription;

    public RealMedicalRecord(String patientName, String diagnosis, String prescription){
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }

    public String getPatientName(){
        return this.patientName;
    }

    public String getDiagnosis(){
        return this.diagnosis;
    }

    public String getPrescription(){
        return this.prescription;
    }

    public void deleteRecord(){
        System.out.println("Deleting record..");
    }
    
}
