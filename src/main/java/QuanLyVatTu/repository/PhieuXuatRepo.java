package QuanLyVatTu.repository;

import QuanLyVatTu.Models.PhieuXuat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuXuatRepo extends JpaRepository<PhieuXuat,Integer> {
}
