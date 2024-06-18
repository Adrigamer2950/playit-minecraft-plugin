package gg.playit.bukkit.api.actions;

public class CreateGuestSession implements Action {
    @Override
    public String getPath() {
        return "/login";
    }

    @Override
    public String getType() {
        return "create-guest-session";
    }
}
