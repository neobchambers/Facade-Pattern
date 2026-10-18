package facade;

public class AudioMixer {
    public String process(String data) {
        if (data == null || data.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Media data cannot be empty"
            );
        }

        System.out.println("Processing audio...");
        System.out.println("Adjusting audio levels...");

        return data + " [audio processed]";
    }
}
