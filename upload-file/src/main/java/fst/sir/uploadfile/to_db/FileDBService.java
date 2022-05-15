package fst.sir.uploadfile.to_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class FileDBService {

    @Autowired
    private  FileDBDao fileDBDao;
    public void store(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        FileDB fileDB = new FileDB(null,fileName,file.getContentType(),file.getBytes());
        fileDBDao.save(fileDB);

    }
    public FileDB getFile(Long id){
        return fileDBDao.getById(id);
    }

    public List<FileDB> findAll() {
        return fileDBDao.findAll();
    }
}
