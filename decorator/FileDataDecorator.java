package decorator;

public abstract class FileDataDecorator implements FileData {
    private FileData fileData;
    
    public FileDataDecorator(FileData fileData) {
        this.fileData = fileData;
    }

    @Override
    public void writeData(byte[] data) {
        fileData.writeData(data);
    }
}
