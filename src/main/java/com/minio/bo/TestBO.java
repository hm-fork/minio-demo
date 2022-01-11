package com.minio.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestBO {

    @Builder.Default
    private String name = "张三";

    @Builder.Default
    private int age =(int) Math.random() * 100;

}
