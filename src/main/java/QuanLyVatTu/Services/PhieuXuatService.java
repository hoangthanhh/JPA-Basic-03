package QuanLyVatTu.Services;

import QuanLyVatTu.Models.ChiTietPhieuXuat;
import QuanLyVatTu.Models.PhieuXuat;
import QuanLyVatTu.Models.VatTu;
import QuanLyVatTu.repository.ChiTietPhieuXuatRepo;
import QuanLyVatTu.repository.PhieuXuatRepo;
import QuanLyVatTu.repository.VatTuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhieuXuatService implements IPhieuXuat{
    @Autowired
    private PhieuXuatRepo phieuXuatRepo;

    @Autowired
    private ChiTietPhieuXuatRepo chiTietPhieuXuatRepo;

    @Autowired
    private VatTuRepo vatTuRepo;

    @Override
    public String themPhieuXuat(PhieuXuat phieuXuat) {
//        phieuXuatRepo.save(phieuXuat);
        for (ChiTietPhieuXuat chiTietPhieuXuat: phieuXuat.getChiTietPhieuXuats()) {
            VatTu vatTu = vatTuRepo.findById(chiTietPhieuXuat.getVatTu().getVatTuId()).get();
            if (vatTu.getSoLuongTonKho() >= chiTietPhieuXuat.getSoLuongXuat()) {
                phieuXuatRepo.save(phieuXuat);
                vatTu.setSoLuongTonKho(vatTu.getSoLuongTonKho() - chiTietPhieuXuat.getSoLuongXuat());
                vatTuRepo.save(vatTu);
                chiTietPhieuXuat.setPhieuXuat(phieuXuat);
                chiTietPhieuXuatRepo.save(chiTietPhieuXuat);
            }
            else {
                return "Phieu xuat ko hop le";
            }
        }
        return "Them thanh cong";
    }
}
