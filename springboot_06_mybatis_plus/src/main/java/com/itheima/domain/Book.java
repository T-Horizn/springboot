package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_dept")
public class Book {
    private Integer did;

    private String dept_name;

}
