import moodanalysis.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMood {

    @Test
    void testCase() {

        Assertions.assertEquals("Sad Mood.", MoodAnalyser.analyserMood("I am in Sad  Mood."));
        Assertions.assertEquals("Happy Mood.", MoodAnalyser.analyserMood("I am in Any Mood"));

        Assertions.assertEquals("Happy Mood.", MoodAnalyser.analyserMood("I am in null Mood"));

        Assertions.assertEquals("Happy Mood.", MoodAnalyser.analyserMood("I am in Empty Mood"));
    }
}
