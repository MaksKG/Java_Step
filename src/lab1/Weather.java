package lab1;

import java.util.List;


public class Weather {
    private int year;
    private String comment;
    private List<Temperature_Measurement> temp_measurements;

    public Weather(int year, String comment, List<Temperature_Measurement> temp_measurements){
        this.year = year;
        this.comment = comment;
        this.temp_measurements = temp_measurements;
    }
    public Weather(List<Temperature_Measurement> temp_measurements){
        this.temp_measurements = temp_measurements;
    }
//    public int getYear(){
//        return this.year;
//    }
//
//    public String getComment(){
//        return this.comment;
//    }

    public void getMinTemperature(){
        Temperature_Measurement minTemperature = null;
        for(Temperature_Measurement measurement: temp_measurements){
            if (minTemperature == null || measurement.getTemperature() < minTemperature.getTemperature()) {
                minTemperature = measurement;
            }
        }
        System.out.println("Date: " + minTemperature.getDate() + " " + "Temperature: " + minTemperature.getTemperature()+ " " + "Comment: " + minTemperature.getComment());
    }

    public void getMaxComment(){
        Temperature_Measurement maxComment = null;
        for(Temperature_Measurement comment: temp_measurements){
            if (maxComment == null || comment.getComment().length() > maxComment.getComment().length()) {
                maxComment = comment;
            }
        }
        System.out.println("Date: " + maxComment.getDate() + " " + "Temperature: " + maxComment.getTemperature()+ " " + "Comment: " + maxComment.getComment());
    }

    public void getLastWordsComment(){
        String lastWord = "";
        for(Temperature_Measurement lastComments: temp_measurements){
            lastWord = lastComments.getComment().substring(lastComments.getComment().lastIndexOf(" ") + 1);
            System.out.println(lastWord);
        }
    }
}


