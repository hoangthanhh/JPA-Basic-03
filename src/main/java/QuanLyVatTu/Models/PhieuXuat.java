package QuanLyVatTu.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "phieuxuat")
public class PhieuXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phieuXuatId;

    @Column(name = "maphieu")
    private String maPhieu;

    @Column(name = "tieude")
    private String tieuDe;

    @Column(name = "ngayxuat")
    private LocalDate ngayXuat;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "phieuXuat")
    @JsonIgnoreProperties(value = "phieuXuat")
    private Set<ChiTietPhieuXuat> chiTietPhieuXuats;

    public int getPhieuXuatId() {
        return phieuXuatId;
    }

    public void setPhieuXuatId(int phieuXuatId) {
        this.phieuXuatId = phieuXuatId;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public LocalDate getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(LocalDate ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public Set<ChiTietPhieuXuat> getChiTietPhieuXuats() {
        return chiTietPhieuXuats;
    }

    public void setChiTietPhieuXuats(Set<ChiTietPhieuXuat> chiTietPhieuXuats) {
        this.chiTietPhieuXuats = chiTietPhieuXuats;
    }
}
