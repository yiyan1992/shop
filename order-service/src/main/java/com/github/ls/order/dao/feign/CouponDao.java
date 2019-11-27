package com.github.ls.order.dao.feign;

import com.github.ls.common.entity.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Primary
@FeignClient(value = "spring-cloud-coupon")
public interface CouponDao {

//    @PostMapping("api/v1/coupon/consumer")
//    ResponseData consumerGoods(@NotNull @RequestParam("goods") List<Coupon> coupons,
//                               @NotBlank @RequestParam("order_no") String orderNo);

}
