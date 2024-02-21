package lab1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Temperature_Measurement temp_maes = new Temperature_Measurement("2024.02.18", 7.3f, "Comment for first");
        Temperature_Measurement temp_maes1 = new Temperature_Measurement("2024.02.17", 8.5f, "Comment for second");
        Temperature_Measurement temp_maes2 = new Temperature_Measurement("2024.02.16", 9.7f, "Comment thirdss");

        List<Temperature_Measurement> measurements = List.of(temp_maes,temp_maes1,temp_maes2);

//        Weather weather1 = new Weather(2024, "Qwerty", measurements);
        Weather weather = new Weather(measurements);
        weather.getMinTemperature();
        weather.getMaxComment();
        weather.getLastWordsComment();


//        weather1.getMinTemperature();
//        weather1.getMaxComment();
//        weather1.getLastWordsComment();
    }
}
