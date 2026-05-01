package P12_Proxy_p5.src;

public class Main {
    public static void main(String[] args) {
        RealMedicalRecord record = new RealMedicalRecord("John Doe", "Type 2 Diabetes", "Metformin 500mg");

        System.out.println("--- Receptionist ---");
        MedicalRecord receptionist = new MedicalRecordProxy(MedicalRecordProxy.ALLOWED_ROLES.RECEPTIONIST, record);
        System.out.println(receptionist.getPatientName());
        System.out.println(receptionist.getDiagnosis());
        System.out.println(receptionist.getPrescription());
        receptionist.deleteRecord();

        System.out.println("\n--- Doctor ---");
        MedicalRecord doctor = new MedicalRecordProxy(MedicalRecordProxy.ALLOWED_ROLES.DOCTOR, record);
        System.out.println(doctor.getPatientName());
        System.out.println(doctor.getDiagnosis());
        System.out.println(doctor.getPrescription());
        doctor.deleteRecord();

        System.out.println("\n--- Admin ---");
        MedicalRecord admin = new MedicalRecordProxy(MedicalRecordProxy.ALLOWED_ROLES.ADMIN, record);
        System.out.println(admin.getPatientName());
        System.out.println(admin.getDiagnosis());
        admin.deleteRecord();
    }
}