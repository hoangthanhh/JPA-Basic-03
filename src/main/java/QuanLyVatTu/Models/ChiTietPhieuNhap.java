package QuanLyVatTu.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "chitietphieunhap")
public class ChiTietPhieuNhap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chiTietPhieuNhapId;

    @Column(name = "soluongnhap")
    private int soLuongNhap;

    @ManyToOne
    @JoinColumn(name = "vattuid")
    private VatTu vatTu;

    @ManyToOne
    @JoinColumn(name = "phieunhapid")
    private PhieuNhap phieuNhap;

    public int getChiTietPhieuNhapId() {
        return chiTietPhieuNhapId;
    }

    public void setChiTietPhieuNhapId(int chiTietPhieuNhapId) {
        this.chiTietPhieuNhapId = chiTietPhieuNhapId;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public VatTu getVatTu() {
        return vatTu;
    }

    public void setVatTu(VatTu vatTu) {
        this.vatTu = vatTu;
    }

    public PhieuNhap getPhieuNhap() {
        return phieuNhap;
    }

    public void setPhieuNhap(PhieuNhap phieuNhap) {
        this.phieuNhap = phieuNhap;
    }
}
