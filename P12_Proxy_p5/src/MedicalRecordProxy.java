package P12_Proxy_p5.src;

//Proxy
public class MedicalRecordProxy implements MedicalRecord{

    private RealMedicalRecord realMedicalRecord;

    private ALLOWED_ROLES role;

    enum ALLOWED_ROLES{
        RECEPTIONIST,
        DOCTOR,
        ADMIN
    }

    public MedicalRecordProxy(ALLOWED_ROLES role, RealMedicalRecord record) {
        this.role = role;
        this.realMedicalRecord = record;
    }

    public String getPatientName(){
        if(role == ALLOWED_ROLES.RECEPTIONIST || role == ALLOWED_ROLES.DOCTOR){
            return realMedicalRecord.getPatientName();
        }
        System.out.println("Access denied!");
        return null;
    }

    public String getDiagnosis() {
        if(role == ALLOWED_ROLES.DOCTOR){
            return realMedicalRecord.getDiagnosis();
        }
        System.out.println("Access denied!");
        return null;
    }

    public String getPrescription(){
        if(role == ALLOWED_ROLES.DOCTOR){
            return realMedicalRecord.getPrescription();
        }
        System.out.println("Access denied!");
        return null;
    }

    public void deleteRecord(){
        if(role == ALLOWED_ROLES.ADMIN){
            realMedicalRecord.deleteRecord();
        }
        else{
            System.out.println("Access denied!");
        }
    }
}
