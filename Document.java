public class Document {
    private String extension;
    private String encryption;

    public Document(String extension, String encryption) {
        this.extension = extension;
        this.encryption = encryption;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }
}
