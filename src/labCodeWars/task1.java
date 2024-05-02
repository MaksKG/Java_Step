//package labCodeWars;
//
//public class Umbrella {
//    public static int minUmbrellas(Weather ...forecast) {
//        int umbrellasAtHome = 0;
//        int umbrellasAtWork = 0;
//        int totalUmbrellas = 0;
//
//        for (int i = 0; i < forecast.length; i++) {
//            if (forecast[i] == Weather.RAINY || forecast[i] == Weather.THUNDERSTORMS) {
//                if (i % 2 == 0) { // Morning
//                    if (umbrellasAtHome > 0) {
//                        umbrellasAtHome--;
//                        umbrellasAtWork++;
//                    } else {
//                        totalUmbrellas++;
//                        umbrellasAtWork++;
//                    }
//                } else { // Afternoon
//                    if (umbrellasAtWork > 0) {
//                        umbrellasAtWork--;
//                        umbrellasAtHome++;
//                    } else {
//                        totalUmbrellas++;
//                        umbrellasAtHome++;
//                    }
//                }
//            }
//        }
//
//        return totalUmbrellas;
//    }
//}
//
