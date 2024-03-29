package com.github.backbook.luwu.model.pojo;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("luwu_kafka_info") // 声明表名称
public class KafkaInfo extends BaseModel{

    @TableId(value = "cluster_id", type = IdType.AUTO)
    private Long clusterId;
    @TableField("cluster_name")
    private String clusterName;
    private String host;
    @TableField("balance_host")
    private String balanceHost;
    private Long port;
    private String version;
    private String description;


}
