package QuanLyVatTu.repository;

import QuanLyVatTu.Models.ChiTietPhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface ChiTietPhieuNhapRepo extends JpaRepository<ChiTietPhieuNhap,Integer> {
}
