package QuanLyVatTu.Controller;

import QuanLyVatTu.Models.VatTu;
import QuanLyVatTu.Services.VatTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VatTuController {
    @Autowired
    private VatTuService vatTuService;

    @RequestMapping(value = "hienthidsvattu", method = RequestMethod.GET)
    public List<String> hienThiDSVatTu() {
        return vatTuService.hienThiDSVatTu();
    }

    @RequestMapping(value = "hienthidsvattucannhap",method = RequestMethod.GET)
    public List<String> hienThiDSVatTuCanNhap() {
        return vatTuService.hienThiDSVatTuCanNhap();
    }
}
