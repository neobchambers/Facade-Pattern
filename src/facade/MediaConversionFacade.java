package facade;

public class MediaConversionFacade {
    private final MetadataReader metadataReader;
    private final CodecFactory codecFactory;
    private final BitrateReader bitrateReader;
    private final AudioMixer audioMixer;

    public MediaConversionFacade() {
        metadataReader = new MetadataReader();
        codecFactory = new CodecFactory();
        bitrateReader = new BitrateReader();
        audioMixer = new AudioMixer();
    }

    public String convert(String fileName, String targetFormat) {
        if (targetFormat == null || targetFormat.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Target format cannot be empty"
            );
        }

        String sourceFormat = metadataReader.readMetadata(fileName);

        if (sourceFormat.equalsIgnoreCase(targetFormat)) {
            System.out.println("File already has the target format.");
            return fileName;
        }

        String codec = codecFactory.createCodec(targetFormat);

        String data = bitrateReader.convertData(fileName, codec);

        String processedData = audioMixer.process(data);

        String result = fileName.substring(
                0, fileName.lastIndexOf(".")
        ) + "." + targetFormat.toLowerCase();

        System.out.println("Conversion completed: " + result);

        return result;
    }
}
