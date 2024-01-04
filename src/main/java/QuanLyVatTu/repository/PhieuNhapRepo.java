package QuanLyVatTu.repository;

import QuanLyVatTu.Models.PhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuNhapRepo extends JpaRepository<PhieuNhap,Integer> {
}
