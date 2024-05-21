public class NormalDoc implements DocumentInterface {

    private String extension;
    private String encryption;

    @Override
    public void SetExtension() {
        extension = ".text";
    }

    @Override
    public void setEncryption() {
        encryption = "none";
    }

    @Override
    public Document BuildDoc() {
        return new Document(extension, encryption);
    }

}
