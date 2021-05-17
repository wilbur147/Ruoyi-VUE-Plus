package com.ruoyi.content.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;


/**
 * 专题编辑对象 ry_con_topic
 *
 * @author ruoyi
 * @date 2021-05-12
 */
@Data
@ApiModel("专题编辑对象")
public class ConTopicEditBo {


    /** 内容专题主键 */
    @ApiModelProperty("内容专题主键")
    private Long conTopicId;

    /** 专题名称 */
    @ApiModelProperty("专题名称")
    private String topicName;

    /** 专题图标 */
    @ApiModelProperty("专题图标")
    private String icon;

    /** 显示顺序 */
    @ApiModelProperty("显示顺序")
    private Integer orderNum;

    /** 描述 */
    @ApiModelProperty("描述")
    private String description;

    /** 更新者 */
    @ApiModelProperty("更新者")
    private String updateBy;

    /** 更新时间 */
    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /** 备注 */
    @ApiModelProperty("备注")
    private String remark;
}
