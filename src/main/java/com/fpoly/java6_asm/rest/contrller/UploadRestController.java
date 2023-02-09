package com.fpoly.java6_asm.rest.contrller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fpoly.java6_asm.entity.Category;
import com.fpoly.java6_asm.service.CategoryService;
import com.fpoly.java6_asm.service.UploadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.io.File;
import java.util.List;

@CrossOrigin("*")
@RestController
@Slf4j
public class UploadRestController {
    @Autowired
    UploadService uploadService;

    @PostMapping("/rest/upload/{folder}")
    public JsonNode upload(@PathParam("file") MultipartFile file,
                           @PathVariable("folder") String folder){
        File saveFile = uploadService.save(file,folder);
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        node.put("name",saveFile.getName());
        node.put("size",saveFile.length());
        return node;
    }
}
