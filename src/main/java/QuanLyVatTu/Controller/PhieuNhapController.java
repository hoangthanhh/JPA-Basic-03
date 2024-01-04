package QuanLyVatTu.Controller;

import QuanLyVatTu.Models.PhieuNhap;
import QuanLyVatTu.Models.PhieuXuat;
import QuanLyVatTu.Services.PhieuNhapService;
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
public class PhieuNhapController {
    @Autowired
    private PhieuNhapService phieuNhapService;

    @RequestMapping(value = "themphieunhap", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public String themPhieuNhap(@RequestBody String phieuNhap) {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer() {
            @Override
            public LocalDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                return LocalDate.parse(jsonElement.getAsJsonPrimitive().getAsString());
            }
        }).create();
        PhieuNhap pn = gson.fromJson(phieuNhap, PhieuNhap.class);
        return phieuNhapService.themPhieuNhap(pn);
    }
}
