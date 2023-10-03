public class Worker {

    private String name;
    private String dateOfBirth;
    private String endOfDate;

    public Worker(){

    }
    public Worker(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(dateOfBirth.substring(6));
        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endOfDate){
        this.endOfDate = endOfDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", endOfDate='" + endOfDate + '\'' +
                '}';
    }
}
