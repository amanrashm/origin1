public class Q27_2 {
//    private int studentId;
//
//    private String studentName;
//
//    private int marks;
//
//    private char grade;
//
//    public Q27_2() {
//    }
//
//    public Q27_2(String studentName,int marks, int studentId) {
//        this.studentName = studentName;
//        this.studentId = studentId;
//        this.marks = marks;
//    }
//public class PrimeNumberExample {
    public static void main(String[] args) {
        int i;
        int num;
//Empty String
        StringBuilder primeNumbers = new StringBuilder();
        for (i = 1; i <= 20000; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers.append(i).append(" ");
            }
        }
        System.out.println("Prime numbers from 1 to 200,000 are :");
        System.out.println(primeNumbers);
    }
}