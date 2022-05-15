package fst.sir.uploadfile.to_db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("file")
public class FileDBRest {
    @PostMapping("/")
    public void store(@RequestParam("file") MultipartFile file) throws IOException {
        fileDBService.store(file);
    }

    @GetMapping("/id/{id}")
    public FileDB getFile(@PathVariable Long id) {
        return fileDBDao.findById(id).get();
    }

    @GetMapping("/")
    public List<FileDB> findAll() {
        return fileDBService.findAll();
    }

    @Autowired
    private FileDBService fileDBService;
    @Autowired
    private FileDBDao fileDBDao;

}
