package QuanLyVatTu.repository;

import QuanLyVatTu.Models.ChiTietPhieuXuat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietPhieuXuatRepo extends JpaRepository<ChiTietPhieuXuat,Integer> {
}
