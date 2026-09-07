package decorator;

public class FileDataWriter implements FileData {
    
    @Override
    public void writeData(byte[] data) {
        System.out.println("Writing data to s3");
    }
}
