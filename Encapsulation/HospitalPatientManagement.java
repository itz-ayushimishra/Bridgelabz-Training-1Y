abstract class Patient{

    protected int patientId;
    protected String name;
    protected int age;

    public Patient(int id,String name,int age){
        patientId=id;
        this.name=name;
        this.age=age;
    }

    abstract double calculateBill();

    public void getPatientDetails(){
        System.out.println(name+" Age:"+age);
    }
}

interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord{

    String record;

    public InPatient(int id,String name,int age){
        super(id,name,age);
    }

    double calculateBill(){
        return 5000;
    }

    public void addRecord(String record){
        this.record=record;
    }

    public void viewRecords(){
        System.out.println(record);
    }
}

class OutPatient extends Patient{

    public OutPatient(int id,String name,int age){
        super(id,name,age);
    }

    double calculateBill(){
        return 1000;
    }
}