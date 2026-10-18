package facade;

public class CodecFactory {
    public String createCodec(String format) {
        if (format == null || format.trim().isEmpty()) {
            throw new IllegalArgumentException("Format cannot be empty");
        }

        String codec;

        switch (format.toLowerCase()) {
            case "mp3":
                codec = "MP3 Codec";
                break;
            case "wav":
                codec = "WAV Codec";
                break;
            case "mp4":
                codec = "MP4 Codec";
                break;
            default:
                throw new IllegalArgumentException(
                        "Unsupported format: " + format
                );
        }

        System.out.println("Created codec: " + codec);
        return codec;
    }
}
