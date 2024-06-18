package gg.playit.bukkit.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import gg.playit.bukkit.minecraft.utils.DecoderException;
import gg.playit.bukkit.minecraft.utils.Hex;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SignedData {
    @JsonProperty
    public String data;

    public byte[] decode() throws DecoderException {
        return Hex.decodeHex(data);
    }
}
