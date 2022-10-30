//package Java_Collection.J08011;
//
//import java.io.File;
//import java.util.*;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Main {
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("D:\\Kì I (2022-2023)\\Java-oop\\src\\DATA.in"));
////        Scanner sc = new Scanner(System.in);
//        Map<String, Integer> map = new LinkedHashMap<>();
//
//        while (sc.hasNext()) {
//            String num = sc.next();
//            if (!map.containsKey(num)) {
//                if (notDecreaseNumber(num))
//                    map.put(num, 1);
//            } else
//                map.put(num, map.get(num) + 1);
//        }
//
//        Map<String, Integer> sortedMap = map.entrySet().stream()
//                .sorted(map.Entry.comparingByValue())
//                .collect(Collectors.toMap(map.Entry::getKey, map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//
//
////        System.out.println(map);
//
//    }
//
//    public static boolean notDecreaseNumber(String num) {
//        for (int i = 0; i < num.length() - 1; i++) {
//            if (num.charAt(i) > num.charAt(i + 1))
//                return false;
//        }
//
//        return true;
//    }
//}
