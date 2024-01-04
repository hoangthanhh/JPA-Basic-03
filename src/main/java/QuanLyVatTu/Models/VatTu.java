package QuanLyVatTu.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "vattu")
public class VatTu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vatTuId;

    @Column(name = "tenvattu")
    private String tenVatTu;

    @Column(name = "soluongtonkho")
    private int soLuongTonKho;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "vatTu")
    @JsonIgnoreProperties(value = "vatTu")
    private Set<ChiTietPhieuNhap> chiTietPhieuNhaps;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "vatTu")
    @JsonIgnoreProperties(value = "vatTu")
    private Set<ChiTietPhieuXuat> chiTietPhieuXuats;

    public int getVatTuId() {
        return vatTuId;
    }

    public void setVatTuId(int vatTuId) {
        this.vatTuId = vatTuId;
    }

    public String getTenVatTu() {
        return tenVatTu;
    }

    public void setTenVatTu(String tenVatTu) {
        this.tenVatTu = tenVatTu;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public Set<ChiTietPhieuNhap> getChiTietPhieuNhaps() {
        return chiTietPhieuNhaps;
    }

    public void setChiTietPhieuNhaps(Set<ChiTietPhieuNhap> chiTietPhieuNhaps) {
        this.chiTietPhieuNhaps = chiTietPhieuNhaps;
    }

    public Set<ChiTietPhieuXuat> getChiTietPhieuXuats() {
        return chiTietPhieuXuats;
    }

    public void setChiTietPhieuXuats(Set<ChiTietPhieuXuat> chiTietPhieuXuats) {
        this.chiTietPhieuXuats = chiTietPhieuXuats;
    }
}
