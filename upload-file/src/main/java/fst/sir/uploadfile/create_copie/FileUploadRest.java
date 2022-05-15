package fst.sir.uploadfile.create_copie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("copie")
public class FileUploadRest {
    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/")
    public void uploadFile(@RequestParam("multipartFile") MultipartFile multipartFile) throws IOException, IllegalStateException {
        fileUploadService.uploadFile(multipartFile);
    }
}
