package moodanalysis;

public class MoodAnalyser {

    public static String analyserMood(String message) {
        String mood = null;
        try{
            if (message.toLowerCase().contains("null")){
                throw new Exception("Invalid Mood.");
            }else {
                if (message.toLowerCase().contains("sad")) {
                    mood = "Sad Mood.";
                }
                if (message.toLowerCase().contains("happy")) {
                    mood = "Happy Mood.";
                }
                if (!message.toLowerCase().contains("sad") && !message.toLowerCase().contains("happy")) {
                    mood = "Happy Mood.";
                }
            }
        }catch (Exception m){
            mood="Happy Mood.";
            System.out.println("Error: "+m.getMessage());
        }
        return mood;
    }
}

