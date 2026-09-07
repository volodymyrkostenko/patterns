package decorator;

public class EnctyptionDecorator extends FileDataDecorator {

    public EnctyptionDecorator(FileData fileData) {
        super(fileData);
    }

    @Override
    public void writeData(byte[] data) {
        super.writeData(encrypt(data));
    }

    private byte[] encrypt(byte[] data) {
        System.out.println("Encrypting data " + new String(data));
        return data;
    }

}
