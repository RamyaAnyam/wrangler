public class ByteSize extends Token {
    private final long bytes;

    public ByteSize(String value) {
        super(value);
        this.bytes = parseBytes(value);
    }

    private long parseBytes(String input) {
        input = input.toUpperCase();
        if (input.endsWith("KB")) return (long)(Double.parseDouble(input.replace("KB", "")) * 1024);
        if (input.endsWith("MB")) return (long)(Double.parseDouble(input.replace("MB", "")) * 1024 * 1024);
        if (input.endsWith("GB")) return (long)(Double.parseDouble(input.replace("GB", "")) * 1024 * 1024 * 1024);
        return Long.parseLong(input.replace("B", ""));
    }

    public long getBytes() {
        return bytes;
    }
}
