package QuanLyVatTu.Services;

import QuanLyVatTu.Models.ChiTietPhieuNhap;
import QuanLyVatTu.Models.PhieuNhap;
import QuanLyVatTu.Models.VatTu;
import QuanLyVatTu.repository.ChiTietPhieuNhapRepo;
import QuanLyVatTu.repository.PhieuNhapRepo;
import QuanLyVatTu.repository.VatTuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhieuNhapService implements IPhieuNhap{
    @Autowired
    private PhieuNhapRepo phieuNhapRepo;
    @Autowired
    private VatTuRepo vatTuRepo;
    @Autowired
    private ChiTietPhieuNhapRepo chiTietPhieuNhapRepo;

    @Override
    public String themPhieuNhap(PhieuNhap phieuNhap) {
//        phieuNhapRepo.save(phieuNhap);
        for (ChiTietPhieuNhap chiTietPhieuNhap: phieuNhap.getChiTietPhieuNhaps()) {
            VatTu vatTu = vatTuRepo.findById(chiTietPhieuNhap.getVatTu().getVatTuId()).get();
            if (vatTu.getSoLuongTonKho() == 0) {
                phieuNhapRepo.save(phieuNhap);
                vatTu.setSoLuongTonKho(vatTu.getSoLuongTonKho() + chiTietPhieuNhap.getSoLuongNhap());
                vatTuRepo.save(vatTu);
                chiTietPhieuNhap.setPhieuNhap(phieuNhap);
                chiTietPhieuNhapRepo.save(chiTietPhieuNhap);
            }
            else {
                return null;
            }
        }
        return "Thêm thành công phiếu nhập";
    }
}
