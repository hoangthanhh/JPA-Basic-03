package QuanLyVatTu.Controller;

import QuanLyVatTu.Models.PhieuXuat;
import QuanLyVatTu.Services.PhieuXuatService;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;
import java.time.LocalDate;

@RestController
public class PhieuXuatController {
    @Autowired
    private PhieuXuatService phieuXuatService;
    @RequestMapping(value = "themphieuxuat", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String themPhieuXuat(@RequestBody String phieuXuat) {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer() {
            @Override
            public LocalDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                return LocalDate.parse(jsonElement.getAsJsonPrimitive().getAsString());
            }
        }).create();
        PhieuXuat px = gson.fromJson(phieuXuat, PhieuXuat.class);
        return phieuXuatService.themPhieuXuat(px);
    }
}
