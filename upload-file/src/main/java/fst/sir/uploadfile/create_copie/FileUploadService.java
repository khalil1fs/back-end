package fst.sir.uploadfile.create_copie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileUploadService {

    public void uploadFile(MultipartFile multipartFile) throws IOException,IllegalStateException {
      multipartFile.transferTo(new File("/home/khalil/Desktop/"+Math.random()+".txt"));
//      multipartFile.getOriginalFilename() : keep the original file name

    }

}
