package QuanLyVatTu.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "chitietphieuxuat")
public class ChiTietPhieuXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chiTietPhieuXuatId;

    @Column(name = "soluongxuat")
    private int soLuongXuat;

    @ManyToOne
    @JoinColumn(name = "vattuid")
    private VatTu vatTu;

    @ManyToOne
    @JoinColumn(name = "phieuxuatid")
    private PhieuXuat phieuXuat;

    public int getChiTietPhieuXuatId() {
        return chiTietPhieuXuatId;
    }

    public void setChiTietPhieuXuatId(int chiTietPhieuXuatId) {
        this.chiTietPhieuXuatId = chiTietPhieuXuatId;
    }

    public int getSoLuongXuat() {
        return soLuongXuat;
    }

    public void setSoLuongXuat(int soLuongXuat) {
        this.soLuongXuat = soLuongXuat;
    }

    public VatTu getVatTu() {
        return vatTu;
    }

    public void setVatTu(VatTu vatTu) {
        this.vatTu = vatTu;
    }

    public PhieuXuat getPhieuXuat() {
        return phieuXuat;
    }

    public void setPhieuXuat(PhieuXuat phieuXuat) {
        this.phieuXuat = phieuXuat;
    }
}
