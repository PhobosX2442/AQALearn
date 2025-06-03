public class main {
        public static void main(String[] args) {
        printFizzBuzz(1, 15);
    }

// Закомменчена базовая Вариация ДЗ

//    public static void printFizzBuzz(int start, int end) {
//        for (int i = start; i <= end; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//}

// Активен вариант с ДЗ, где метод игнорирует обычные числа, подходящие прописывает сразу со значением

    public static void printFizzBuzz(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }
        }
    }
}