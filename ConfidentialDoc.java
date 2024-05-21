public class ConfidentialDoc implements DocumentInterface {

    private String extension;
    private String encryption;

    @Override
    public void SetExtension() {
        extension = ".zip";
    }

    @Override
    public void setEncryption() {
        encryption = "AES";
    }

    @Override
    public Document BuildDoc() {
        return new Document(extension, encryption);
    }

}
