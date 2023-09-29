public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            Student s = new Student("s92335" + i,
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
    }
}