package lab1;

public class Temperature_Measurement {
    private String date;
    private float temperature;
    private String comment;

    public Temperature_Measurement(String date, float temperature, String comment){
        this.date = date;
        this.comment = comment;
        this.temperature = temperature;
    }

    public String getDate(){
        return this.date;
    }

    public float getTemperature(){
        return this.temperature;
    }

    public String getComment(){
        return this.comment;
    }
}


