package decorator;

public class CompressDecorator extends FileDataDecorator {
    
    public CompressDecorator(FileData fileData) {
        super(fileData);
    }
    
    @Override
    public void writeData(byte[] data) {
        super.writeData(compress(data));
    }
    
    private byte[] compress(byte[] data) {
        System.out.println("Compressing data " + new String(data));
        return data;
    }
    
}
