package QuanLyVatTu.Services;

import QuanLyVatTu.Models.VatTu;
import QuanLyVatTu.repository.VatTuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VatTuService implements IVatTu{
    @Autowired
    private VatTuRepo vatTuRepo;

    @Override
    public List<String> hienThiDSVatTu() {
        List<VatTu> danhSachVatTu = vatTuRepo.findAll();
        List<String> danhSachHienThi = new ArrayList<>();
        danhSachVatTu.forEach(vatTu -> {
            if (vatTu.getSoLuongTonKho() == 0) {
                danhSachHienThi.add(vatTu.getTenVatTu() + " - Het hang");
            } else {
                danhSachHienThi.add(vatTu.getTenVatTu() + " - SLTK: " + vatTu.getSoLuongTonKho());
            }
        });
        return danhSachHienThi;
    }

    @Override
    public List<String> hienThiDSVatTuCanNhap() {
        return vatTuRepo.hienThiDSVatTuCanNhap();
    }
}
