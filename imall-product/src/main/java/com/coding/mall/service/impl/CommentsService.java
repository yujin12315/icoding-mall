package com.coding.mall.service.impl;

import com.coding.mall.entity.Comments;
import com.coding.mall.mapper.CommentsMapper;
import com.coding.mall.service.ICommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Coding
 * @since 2020-01-08
 */
@Service
public class CommentsService extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
