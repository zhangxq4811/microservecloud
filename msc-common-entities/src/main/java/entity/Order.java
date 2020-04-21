package entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zxq
 * @date 2020/3/31 14:31
 **/
@Data
public class Order {

    private Integer id;

    private Date createTime;

    private BigDecimal amount;

}
