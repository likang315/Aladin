package com.aladin.dao.product;

import com.aladin.pojo.product.Picture;

public interface PictureMapper {

    /**
     * @param picId
     * 按图片id查找图片
     */
    Picture findPictureById(Long picId);
}