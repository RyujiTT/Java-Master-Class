public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("s92335" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
                    },
                    "09/29/2000",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("s923356", "Ann", "09/29/2000", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("s923357", "James", "09/29/2000", "Java Maserclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList((pojoStudent.getClassList() + ", Java OCP Exam 892"));

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}