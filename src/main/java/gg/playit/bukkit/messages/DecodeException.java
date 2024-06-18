package gg.playit.bukkit.messages;

public class DecodeException extends RuntimeException {
    public final String message;

    public DecodeException(String message) {
        super(message);
        this.message = message;
    }
}
