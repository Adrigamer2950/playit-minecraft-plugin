package gg.playit.bukkit.api.actions;

public class GetStatus implements Action {
    @Override
    public String getPath() {
        return "/login";
    }

    @Override
    public String getType() {
        return "get-session";
    }
}
