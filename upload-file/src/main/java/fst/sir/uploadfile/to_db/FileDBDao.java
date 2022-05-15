package fst.sir.uploadfile.to_db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDBDao extends JpaRepository<FileDB,Long> {


}
