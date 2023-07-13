package moodanalysis;

public class MoodAnalyser {

    public static String analyserMood(String message) {
        String mood = null;
        if (message.toLowerCase().contains("sad")) {
            mood = "Sad Mood.";
        }
        if (message.toLowerCase().contains("happy")) {
            mood = "Happy Mood.";
        }
        if (!message.toLowerCase().contains("sad") && !message.toLowerCase().contains("happy")) {
            mood = "Happy Mood.";
        }
        return mood;
    }
}

