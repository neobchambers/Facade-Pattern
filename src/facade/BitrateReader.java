package facade;

public class BitrateReader {
    public String convertData(String fileName, String codec) {
        if (fileName == null || codec == null) {
            throw new IllegalArgumentException(
                    "File name and codec are required"
            );
        }

        System.out.println("Reading media data from " + fileName);
        System.out.println("Converting data using " + codec);

        return "Converted media data";
    }
}
