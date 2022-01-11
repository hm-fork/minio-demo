package com.minio;

import cn.hutool.json.JSONUtil;
import com.minio.bo.TestBO;
import com.minio.service.PersonServiceImpl;
import com.minio.utils.MinioUtil;
import io.minio.errors.*;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
class MinioDemoApplicationTests {
    @Autowired
    PersonServiceImpl personService;

    @Autowired
    MinioUtil minioUtil;

    @Test
    void contextLoads() {

        System.out.println("");
        personService.writeFile();
    }

    @Test
    void composeTest() throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException {
        minioUtil.composeFile("test-one");
    }

    @Test
    void writeTest() throws ServerException, InsufficientDataException, ErrorResponseException, IOException, NoSuchAlgorithmException, InvalidKeyException, InvalidResponseException, XmlParserException, InternalException, InterruptedException {
        TestBO content = TestBO.builder().build();
        for(long i=0; i<10000; i++) {
            log.info(JSONUtil.toJsonPrettyStr(content));
        }
    }

}
