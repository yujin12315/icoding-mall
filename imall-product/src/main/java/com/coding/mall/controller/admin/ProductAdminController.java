package com.coding.mall.controller.admin;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.coding.common.constants.ResultCodeEnum;
import com.coding.common.exception.CodingException;
import com.coding.common.vo.R;
import com.coding.mall.entity.Product;
import com.coding.mall.query.ProductQuery;
import com.coding.mall.service.IProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(description = "后台产品管理接口")
@RestController //Controller 可以被视图解析器解析  @RestController只会返回字符串
@RequestMapping("/admin/mall/product")
@CrossOrigin //支持了跨域！
public class ProductAdminController {

    //产品业务 ，注意接口问题！IProductService
    @Autowired
    private IProductService productService;

    // 查询全部的产品
    @ApiOperation(value="所有产品列表")
    @GetMapping
    public R list(){
        List<Product> list = productService.list(null);
        return R.ok().data("items",list);
    }

    // 删除
    @ApiOperation(value="通过ID删除商品")
    @DeleteMapping("{id}")
    public R removeById(
            @ApiParam(name = "id",value = "产品的唯一ID",required = true)
            @PathVariable int id){
        productService.removeById(id);
        return R.ok();
    }


    // 分页 条件查询
    @ApiOperation(value = "产品查询分页")
    @GetMapping("{page}/{limit}")
    public R pageList(
            @ApiParam(name = "page",value = "当前页",required = true)
            @PathVariable Long page,

            @ApiParam(name = "limit",value = "每页记录数",required = true)
            @PathVariable Long limit,

            @ApiParam(name = "productQuery",value = "查询对象",required = false)
            ProductQuery productQuery){

        // 判断
        if (page<=0 || limit <=0){
            //throw new CodingException(21005,"参数不正确");
            throw new CodingException(ResultCodeEnum.PARAM_ERROR);
        }


        Page<Product> pageParam = new Page<>(page,limit);

        productService.pageQuery(pageParam,productQuery); //业务代码

        List<Product> records = pageParam.getRecords(); // 获取数据列表
        long total = pageParam.getTotal(); // 获得总数

        return R.ok().data("total",total).data("rows",records);
    }

    // 自动填充！
    // 新增产品
    @ApiOperation(value = "新增产品")
    @PostMapping
    public R save(
            @ApiParam(name = "product",value = "产品对象",required = true)
            @RequestBody Product product){
        productService.save(product);

        return R.ok();
    }

    // 修改产品
    @ApiOperation(value = "修改产品")
    @PutMapping("{id}")
    public R updateById(
            @ApiParam(name = "id",value = "产品ID",required = true)
            @PathVariable int id,

            @ApiParam(name = "product",value = "产品对象",required = true)
            @RequestBody Product product){

        product.setId(id);
        productService.updateById(product);

        return R.ok();
    }







}
