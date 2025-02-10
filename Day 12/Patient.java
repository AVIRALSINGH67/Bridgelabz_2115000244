abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient {
    public InPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 2000.0; // Example flat bill for InPatient
    }
}

class OutPatient extends Patient {
    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return 500.0; // Example flat bill for OutPatient
    }
}

interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

class HospitalSystem {
    public static void main(String[] args) {
        Patient patient1 = new InPatient("P001", "Alice", 30);
        patient1.getPatientDetails();
        System.out.println("Bill for In-Patient: " + patient1.calculateBill());

        Patient patient2 = new OutPatient("P002", "Bob", 25);
        patient2.getPatientDetails();
        System.out.println("Bill for Out-Patient: " + patient2.calculateBill());
    }
}
