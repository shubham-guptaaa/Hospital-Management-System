import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Patient Class
class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String contact;
    private String medicalHistory;

    public Patient(int id, String name, int age, String gender, String address, String contact, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
        this.medicalHistory = medicalHistory;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getAddress() { return address; }
    public String getContact() { return contact; }
    public String getMedicalHistory() { return medicalHistory; }

    @Override
    public String toString() {
        return "Patient [ID=" + id + ", Name=" + name + ", Age=" + age + ", Gender=" + gender + "]";
    }
}

// Appointment Class
class Appointment {
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private LocalDateTime appointmentTime;

    public Appointment(int appointmentId, int patientId, int doctorId, LocalDateTime appointmentTime) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentTime = appointmentTime;
    }

    // Getters and Setters
    public int getAppointmentId() { return appointmentId; }
    public int getPatientId() { return patientId; }
    public int getDoctorId() { return doctorId; }
    public LocalDateTime getAppointmentTime() { return appointmentTime; }

    @Override
    public String toString() {
        return "Appointment [ID=" + appointmentId + ", PatientID=" + patientId + ", DoctorID=" + doctorId + "]";
    }
}

// EHR Class
class EHR {
    private int ehrId;
    private int patientId;
    private String diagnosis;
    private String testResults;
    private String prescriptions;
    private String treatmentPlan;

    public EHR(int ehrId, int patientId, String diagnosis, String testResults, String prescriptions, String treatmentPlan) {
        this.ehrId = ehrId;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.testResults = testResults;
        this.prescriptions = prescriptions;
        this.treatmentPlan = treatmentPlan;
    }

    // Getters and Setters
    public int getEhrId() { return ehrId; }
    public int getPatientId() { return patientId; }
    public String getDiagnosis() { return diagnosis; }
    public String getTestResults() { return testResults; }
    public String getPrescriptions() { return prescriptions; }
    public String getTreatmentPlan() { return treatmentPlan; }

    @Override
    public String toString() {
        return "EHR [ID=" + ehrId + ", PatientID=" + patientId + ", Diagnosis=" + diagnosis + "]";
    }
}

// Billing Class
class Billing {
    private int billId;
    private int patientId;
    private double totalAmount;
    private boolean isPaid;

    public Billing(int billId, int patientId, double totalAmount, boolean isPaid) {
        this.billId = billId;
        this.patientId = patientId;
        this.totalAmount = totalAmount;
        this.isPaid = isPaid;
    }

    // Getters and Setters
    public int getBillId() { return billId; }
    public int getPatientId() { return patientId; }
    public double getTotalAmount() { return totalAmount; }
    public boolean isPaid() { return isPaid; }

    @Override
    public String toString() {
        return "Billing [ID=" + billId + ", PatientID=" + patientId + ", TotalAmount=" + totalAmount + "]";
    }
}

// Inventory Class
class Inventory {
    private int itemId;
    private String itemName;
    private int quantity;
    private LocalDateTime expirationDate;

    public Inventory(int itemId, String itemName, int quantity, LocalDateTime expirationDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    // Getters and Setters
    public int getItemId() { return itemId; }
    public String getItemName() { return itemName; }
    public int getQuantity() { return quantity; }
    public LocalDateTime getExpirationDate() { return expirationDate; }

    @Override
    public String toString() {
        return "Inventory [ID=" + itemId + ", Name=" + itemName + ", Quantity=" + quantity + "]";
    }
}

// Staff Class
class Staff {
    private int staffId;
    private String name;
    private String role;
    private double salary;
    private LocalDateTime hireDate;

    public Staff(int staffId, String name, String role, double salary, LocalDateTime hireDate) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getters and Setters
    public int getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public double getSalary() { return salary; }
    public LocalDateTime getHireDate() { return hireDate; }

    @Override
    public String toString() {
        return "Staff [ID=" + staffId + ", Name=" + name + ", Role=" + role + "]";
    }
}

// Main Hospital Management System
public class hms {
    private static List<Patient> patients = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();
    private static List<EHR> ehrRecords = new ArrayList<>();
    private static List<Billing> billings = new ArrayList<>();
    private static List<Inventory> inventories = new ArrayList<>();
    private static List<Staff> staffMembers = new ArrayList<>();

    public static void main(String[] args) {
        // Sample Data
        patients.add(new Patient(1, "John Doe", 30, "Male", "123 Main St", "555-1234", "None"));
        appointments.add(new Appointment(1, 1, 101, LocalDateTime.now()));
        ehrRecords.add(new EHR(1, 1, "Flu", "Negative", "Ibuprofen", "Rest and hydrate"));
        billings.add(new Billing(1, 1, 150.00, false));
        inventories.add(new Inventory(1, "Aspirin", 100, LocalDateTime.now().plusMonths(6)));
        staffMembers.add(new Staff(1, "Dr. Smith", "Doctor", 120000, LocalDateTime.now()));

        // Print sample data
        printData();
    }

    public static void printData() {
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }

        System.out.println("\nAppointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }

        System.out.println("\nEHR Records:");
        for (EHR ehr : ehrRecords) {
            System.out.println(ehr);
        }

        System.out.println("\nBillings:");
        for (Billing billing : billings) {
            System.out.println(billing);
        }

        System.out.println("\nInventories:");
        for (Inventory inventory : inventories) {
            System.out.println(inventory);
        }

        System.out.println("\nStaff Members:");
        for (Staff staff : staffMembers) {
            System.out.println(staff);
        }
    }
}
