package moodanalysis;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wellcome To Junit Testing of Mood Analyzer Problem.");

        String message = "I am feeling Happy today!";
        System.out.println(MoodAnalyser.analyserMood(message));

        String messageTC11 = "I am in Sad  Mood.";
        System.out.println("TC1.1 => " + MoodAnalyser.analyserMood(messageTC11));

        String messageTC12 = "I am in Any Mood";
        System.out.println("TC1.2 => " + MoodAnalyser.analyserMood(messageTC12));
    }
}
