package QuanLyVatTu.repository;

import QuanLyVatTu.Models.VatTu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VatTuRepo extends JpaRepository<VatTu,Integer> {
    @Query(value = "select tenvattu from vattu where soluongtonkho = 0", nativeQuery = true)
    List<String> hienThiDSVatTuCanNhap();
}
