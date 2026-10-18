package facade;

public class MetadataReader {
    public String readMetadata(String fileName) {
        if (fileName == null || fileName.trim().isEmpty()) {
            throw new IllegalArgumentException("File name cannot be empty");
        }

        int dotIndex = fileName.lastIndexOf(".");

        if (dotIndex == -1 || dotIndex == fileName.length() - 1) {
            throw new IllegalArgumentException("File must have an extension");
        }

        String format = fileName.substring(dotIndex + 1).toLowerCase();

        System.out.println("Reading metadata: " + fileName);
        System.out.println("Source format: " + format);

        return format;
    }
}
