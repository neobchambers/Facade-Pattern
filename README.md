# Facade-Pattern

# Media Conversion Facade

## Description
This project demonstrates the Facade design pattern in Java.
The MediaConversionFacade provides a simple way to convert media files. It coordinates several subsystem classes and hides the internal conversion steps from the client.
The project simulates media conversion and does not create a real converted audio file.

## Technologies
- Java
- JDK 17
- IntelliJ IDEA

## Project Structure
- Main.java - starts the program and uses the Facade.
- MediaConversionFacade.java - coordinates the conversion process.
- MetadataReader.java - reads file metadata and detects the source format.
- CodecFactory.java - selects a codec for the target format.
- BitrateReader.java - simulates media data conversion.
- AudioMixer.java - simulates audio processing.

## How It Works
1. The client calls the convert() method.
2. MetadataReader detects the source format.
3. CodecFactory creates the required codec.
4. BitrateReader simulates data conversion.
5. AudioMixer processes the media data.
6. The Facade returns the name of the output file.

## Example
Input file: song.wav
Target format: mp3
Output name: song.mp3

## Design Pattern
The Facade pattern provides a simple interface to a complex subsystem. The client communicates only with MediaConversionFacade instead of calling the subsystem classes directly.

## Clean Code
The project uses meaningful class and method names, separates responsibilities, hides internal implementation details, and checks invalid input.
