package com.minio.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_person")
public class Person {
    private int id;
    private String name;
    private Integer age;
    private String groupId;

    /**
     * 排除非表中的字段的 三种方式：
     */
    /**
     * 1、使用tableField进行转换，将实体类中的cccName转换成数据库表中的name字段
     */
    @TableField("name")
    private String cccName;

    /**
     * 2、transient关键字能够让MP插入的时候忽略该字段
     */
    private transient String excludeName;

    /**
     * 3、利用static关键字指定静态变量，不会在MP存储的时候出现在SQL中
     */
    private static String staticNmae;
    public static void setStaticNmae(String staticNmae) {
        Person.staticNmae = staticNmae;
    }

    /**
     * TableField + exist 表示数据库表中不存在该字段，MP生成SQL时会忽略该字段
     */
    @TableField(exist = false)
    private String existName;
}
